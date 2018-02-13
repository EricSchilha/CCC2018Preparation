import java.io.*;
import java.util.*;
//INCOMPLETE
public class S32003 {
    static char arcFloorPlan[][];

    public static void main(String args[]) {
        Scanner sin = new Scanner(System.in);
        ArrayList<Integer> alRoomSizes = new ArrayList<>();
        int nFlooring = sin.nextInt(), nHeight = sin.nextInt(), nWidth = sin.nextInt(), nFilledRooms = 0;
        arcFloorPlan = new char[nHeight][nWidth];
        for (int y = 0; y < nHeight; y++) {
            String sRow = sin.nextLine();
            for (int x = 0; x < sRow.length(); x++) {
                arcFloorPlan[y][x] = sRow.charAt(x);
            }
        }
        for (int y = 0; y < nHeight; y++) {
            for (int x = 0; x < nWidth; x++) {
                if (arcFloorPlan[y][x] == '.') {
                    alRoomSizes.add(findRoomSize(x, y, 1));
                }
            }
        }
        Collections.sort(alRoomSizes);
        Collections.reverse(alRoomSizes);
        for (int i = 0; i < alRoomSizes.size(); i++) {
            if (alRoomSizes.get(i) <= nFlooring) {
                nFilledRooms++;
                nFlooring -= alRoomSizes.get(i);
            } else {
                System.out.println(nFilledRooms + " rooms, " + nFlooring + " square metre(s) left over");
                return;
            }
        }
    }

    public static int findRoomSize(int nX, int nY, int nRoomSize) {
        arcFloorPlan[nY][nX] = 'I';
        for (int y = -1; y < 2; y++) {
            for (int x = -1; x < 2; x++) {
                if((x==-1&&y==-1)||(x==-1&&y==1)||(x==1&&y==-1)||(x==1&&y==1)) continue;
                try {
                    if (arcFloorPlan[y+nY][x+nX] == '.') {
                        nRoomSize = findRoomSize(nX + x, nY + y, nRoomSize + 1);
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return nRoomSize;
    }
}
