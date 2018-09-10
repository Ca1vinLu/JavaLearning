package job;

import java.util.Scanner;

public class ByteDance2 {
    private static int m;
    private static int teamCount = 0;
    private static int groupCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        int[][] group = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int t = scanner.nextInt();
                if (t == 1)
                    teamCount++;
                group[i][j] = t;
            }
        }

        while (teamCount > 1) {
            for (int i = 0; i < m; i++) {
                boolean find = false;
                for (int j = 0; j < m; j++) {
                    if (group[i][j] != 0) {
                        search(group, i, j);
                        groupCount++;
                        find = true;
                        break;
                    }
                }
                if (find)
                    break;
            }
        }

        System.out.println(teamCount == 1 ? groupCount + 1 : groupCount);
    }

    private static void search(int[][] group, int x, int y) {
        if (0 <= x && x < m && 0 <= y && y < m) {
            if (group[x][y] == 1) {
                group[x][y] = 0;
                teamCount--;
                search(group, x + 1, y);
                search(group, x - 1, y);
                search(group, x, y + 1);
                search(group, x, y - 1);
            }
        }

    }


}

/**
 * 4
 * 1 0 0 0
 * 0 0 0 0
 * 0 0 0 1
 * 0 0 0 0
 * <p>
 * 5
 * 1 0 0 1 1
 * 1 0 0 1 1
 * 0 0 1 0 0
 * 0 0 1 0 0
 * 0 0 1 0 0
 */
