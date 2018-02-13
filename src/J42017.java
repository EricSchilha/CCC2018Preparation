import java.util.Scanner;
//INCOMPLETE
public class J42017 {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int D = sin.nextInt();
        int nCount = 0;
        int nTime = 0;
        int arnGoodTimes[] = {34, 71, 142, 213, 284, 355, 83, 95, 107, 119, 154, 166, 178, 225, 237, 296, 671};
        for (int i = 1; i <= D; i++) {
            nTime++;
            if (nTime == 720) nTime = 0;
            for (int j = 0; j < arnGoodTimes.length; j++) {
                if (arnGoodTimes[j] == nTime) {
                    nCount++;
                    break;
                }
            }
        }
        System.out.println(nCount);
    }
}
/*
12:00 == 0

12:34
1:23
1:35
1:47
1:59
2:34
2:46
2:58
3:45
3:57
4:56

1:11
2:22
3:33
4:44
5:55
11:11
 */