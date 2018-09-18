package leetcode;


/**
 * 最长公共前缀
 */
public class LeetCode14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[0]));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int index = 0;
        if (strs != null && strs.length != 0) {
            while (true) {
                boolean hasDiff = false;
                if (strs[0].length() <= index)
                    break;
                char c = strs[0].charAt(index);
                for (String str : strs) {
                    if (index >= str.length() || str.charAt(index) != c)
                        hasDiff = true;
                }

                if (hasDiff) {
                    break;
                } else {
                    prefix.append(c);
                    index++;
                }

            }
        }
        return prefix.toString();
    }
}
