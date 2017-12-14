import java.util.*;

public class S52017 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nStations = sin.nextInt();
        int nLines = sin.nextInt();
        int nActions = sin.nextInt();
        int arnLNums[] = new int[nStations];
        int arnPpl[] = new int[nStations];
        int nSurveyStart, nSurveyFinish, nSurveyType, nSurveyCount, nLineChange, nTempPpl1 = 0, nTempPpl2 = 0, nFirstStation = 0, nLastTemp = 2;
        boolean foundFirst = false;
        ArrayList<Integer> alOutput = new ArrayList<>();

        for (int i = 0; i < nStations; i++) {
            arnLNums[i] = sin.nextInt();
        }

        for (int i = 0; i < nStations; i++) {
            arnPpl[i] = sin.nextInt();
        }

        for (int i = 0; i < nActions; i++) {
            nSurveyType = sin.nextInt();
            if (nSurveyType == 1) {
                nSurveyStart = sin.nextInt();
                nSurveyFinish = sin.nextInt();
                nSurveyCount = 0;
                for (int j = nSurveyStart - 1; j < nSurveyFinish; j++) {
                    nSurveyCount += arnPpl[j];
                }
                alOutput.add(nSurveyCount);
            } else {
                nLineChange = sin.nextInt();
                foundFirst = false;
                if (nLineChange <= nLines && nLineChange > 0) {
                    for (int j = 0; j < nStations; j++) {
                        if (arnLNums[j] == nLineChange) {
                            if (!foundFirst) {
                                foundFirst = true;
                                nFirstStation = j;
                                nLastTemp = 1;
                                nTempPpl1 = arnPpl[j];
                            } else {
                                if (nLastTemp == 1) {
                                    nLastTemp = 2;
                                    nTempPpl2 = arnPpl[j];
                                    arnPpl[j] = nTempPpl1;
                                } else {
                                    nLastTemp = 1;
                                    nTempPpl1 = arnPpl[j];
                                    arnPpl[j] = nTempPpl2;
                                }
                            }
                        }
                        if (j == nStations - 1 && foundFirst) {
                            arnPpl[nFirstStation] = (nLastTemp == 1) ? nTempPpl1 : nTempPpl2;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < alOutput.size(); i++) {
            System.out.println(alOutput.get(i));
        }
    }

}