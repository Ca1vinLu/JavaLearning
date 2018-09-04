package swortoffer;

/**
 * 剑指Offer面试题5
 */
public class Issue5 {
    public static void main(String[] args) {
        char[] charArray = "we are one".toCharArray();
        replaceStrFromStart(charArray);
        replaceStrFromEnd(charArray);
    }


    //从尾部开始添加
    private static void replaceStrFromEnd(char[] charArr) {
        System.out.println("replaceStrFromEnd");
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

    //从头部开始添加
    private static void replaceStrFromStart(char[] charArr) {
        System.out.println("replaceStrFromStart");
        System.out.println("after replace: " + String.valueOf(charArr));
        int blankCount = 0;
        for (char c : charArr) {
            if (c == ' ')
                blankCount++;
        }

        //新建数组长度 = 原数组长度 + 空格数 * 2
        char[] newArr = new char[charArr.length + blankCount * 2];
        int oldArrLeft = 0;
        int newArrLeft = 0;

        for (; oldArrLeft < charArr.length; oldArrLeft++) {
            char c = charArr[oldArrLeft];
            if (c == ' ') {
                newArr[newArrLeft++] = '%';
                newArr[newArrLeft++] = '2';
                newArr[newArrLeft++] = '0';
            } else {
                newArr[newArrLeft++] = c;
            }
        }

        System.out.println("after replace: " + String.valueOf(newArr));
    }


}
