package algorithm;

/**
 * 剑指Offer面试题4
 */
public class Offer4 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}};
        findNumber(matrix, 4, 4, 16);
    }

    static boolean findNumber(int[][] matrix, int row, int column, int target) {
        int i = 0, j = column - 1;
        while (i < row && j >= 0) {
            int value = matrix[i][j];
            if (value == target) {
                System.out.println("Find:[" + i + " , " + j + "]");
                return true;
            } else if (value > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("NotFind");
        return false;
    }
}
