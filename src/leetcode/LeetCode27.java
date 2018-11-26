package leetcode;

public class LeetCode27 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(arr, 2));
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            int value = nums[i];
            if (value == val) {

                // swap
                nums[i] = nums[nums.length - 1 - count];
                nums[nums.length - 1 - count] = value;
                count++;

                System.out.println("---------change--------------");
                for (int i1 : nums) {
                    System.out.println(i1);
                }
            }
        }

        return count;

    }
}
