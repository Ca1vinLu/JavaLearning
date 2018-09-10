package job;

import java.util.Scanner;

public class Netease3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int commendNum = scanner.nextInt();
        int[] capacity = new int[n];
        int[] realCapacity = new int[n];
        for (int i = 0; i < n; i++) {
            capacity[i] = scanner.nextInt();
        }

        for (int i = 0; i < commendNum; i++) {
            int type = scanner.nextInt();
            if (type == 1) {
                System.out.println(realCapacity[scanner.nextInt() - 1]);
            } else {
                int floor = scanner.nextInt() - 1;
                int size = scanner.nextInt();

                while (floor < capacity.length) {
                    int remainSize = capacity[floor] - realCapacity[floor];
                    if (remainSize >= size) {
                        realCapacity[floor] += size;
                        break;
                    } else {
                        realCapacity[floor] = capacity[floor];
                        floor++;
                        size -= remainSize;
                    }
                }
            }
        }
    }
}


/**
 * 1 2
 * 8
 * 2 1 9
 * 1 1
 * <p>
 * <p>
 * 5 4
 * 1 2 2 10 1
 * 1 3
 * 2 2 5
 * 2 4 3
 * 1 4
 */
