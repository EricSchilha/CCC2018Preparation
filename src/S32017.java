import java.io.*;
import java.util.*;

public class S32017 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nBoards = sin.nextInt(), nMax = 0, nBoardA, nBoardB, nFenceLength, nBoardsOfSameLength, nWays = 0;
        int arnCounts[] = new int[2001];
        for(int i = 0; i < arnCounts.length; i++){
            arnCounts[i] = 0;
        }
        for(int i = 0; i < nBoards; i++){
            arnCounts[sin.nextInt()]++;
        }

        for(int i = 2; i <= 4000; i++){
            int arnCountsCopy[] = Arrays.copyOf(arnCounts, arnCounts.length);
            nBoardA = Math.max(1, i - 2000);
            nBoardB = i - nBoardA;
            nFenceLength = 0;

            while(nBoardA <= i/2){
                if(nBoardA == nBoardB){
                    nBoardsOfSameLength = arnCountsCopy[nBoardA] / 2;
                    arnCountsCopy[nBoardA] -= nBoardsOfSameLength * 2;
                    nFenceLength += nBoardsOfSameLength;
                } else {
                    nBoardsOfSameLength = Math.min(arnCountsCopy[nBoardA], arnCountsCopy[nBoardB]);
                    arnCountsCopy[nBoardA] -= nBoardsOfSameLength;
                    arnCountsCopy[nBoardB] -= nBoardsOfSameLength;
                    nFenceLength += nBoardsOfSameLength;
                }
                nBoardA++;
                nBoardB--;
            }

            if(nFenceLength > nMax){
                nMax = nFenceLength;
                nWays = 1;
            } else if(nFenceLength == nMax){
                nWays++;
            }

        }
        System.out.println(nMax + " " + nWays);
    }
}