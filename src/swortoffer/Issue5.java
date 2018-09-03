package swortoffer;

/**
 * 剑指Offer面试题5
 */
public class Issue5 {
    public static void main(String[] args) {
        char[] charArray = "we are one".toCharArray();
        replaceStr(charArray);
    }

    public static void replaceStr(char[] charArr) {
        System.out.println("after replace: " + String.valueOf(charArr));
        int blankCount = 0;
        for (char c : charArr) {
            if (c == ' ')
                blankCount++;
        }

        //新建数组长度 = 原数组长度 + 空格数 * 2
        char[] newArr = new char[charArr.length + blankCount * 2];
        int oldArrRight = charArr.length - 1;
        int newArrRight = newArr.length - 1;

        for (; oldArrRight >= 0; oldArrRight--) {
            char c = charArr[oldArrRight];
            if (c == ' ') {
                newArr[newArrRight--] = '0';
                newArr[newArrRight--] = '2';
                newArr[newArrRight--] = '%';
            } else {
                newArr[newArrRight--] = c;
            }
        }

        System.out.println("after replace: " + String.valueOf(newArr));
    }
}
