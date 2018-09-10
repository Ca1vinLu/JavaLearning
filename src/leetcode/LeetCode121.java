package leetcode;

public class LeetCode121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int maxProfit = 0;
        int curPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (curPrice < prices[i]) {
                if (maxProfit < prices[i] - curPrice) {
                    maxProfit = prices[i] - curPrice;
                }
            } else {
                curPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
