package algorithm;

/**
 * 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        //测试数据
        int[] arr = {9, 5, 7, 8, 2, 4, 3, 0, 1, 5, 8, 2, 6, 4, 11, 4};
        for (int i : arr) {
            System.out.print(i + ",");
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }


    /**
     * 快速排序
     *
     * @param arr   数组
     * @param left  起始下标
     * @param right 结束下标
     */
    private static void quickSort(int[] arr, int left, int right) {
        System.out.println("quickSort left:" + left + " right:" + right);

        if (left >= right) {
            return;
        }

        int i = left, j = right;
        int sign = arr[left];
        while (i < j) {
            while (arr[j] >= sign && i < j) j--;

            if (i < j) {
                arr[i] = arr[j];

                while (arr[i] <= sign && i < j) i++;
                if (i < j) {
                    arr[j] = arr[i];
                }
            }
        }

        arr[i] = sign;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }


}
