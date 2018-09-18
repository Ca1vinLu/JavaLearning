package job;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tencent3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String p = scanner.next();


        int sampleLength = 0;
        char[] tempArr = p.toCharArray();
        for (int i = 0, j = tempArr.length - 1; i < j; i++, j--) {
            if (tempArr[i] == tempArr[j])
                sampleLength++;
            else break;
        }
        String sampleSubStr = "";
        if (sampleLength != 0)
            sampleSubStr = p.substring(sampleLength);

        int maxLength = 0;


        Pattern pattern1 = Pattern.compile(p);
        Pattern pattern2 = Pattern.compile("(" + p + ")" + "+");
        Matcher matcher = pattern1.matcher(s);
        if (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                maxLength = Math.max(maxLength, matcher.group(i).length());
            }
        }

        matcher = pattern2.matcher(s);
        if (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                maxLength = Math.max(maxLength, matcher.group(i).length());
            }
        }

        for (int i = 0; i < sampleLength; i++) {
            Pattern pattern3 = Pattern.compile("(" + p + ")" + "+" + p.substring(i + 1));
            matcher = pattern3.matcher(s);
            if (matcher.find()) {
                for (int j = 0; j < matcher.groupCount(); j++) {
                    maxLength = Math.max(maxLength, matcher.group(j).length());
                }
            }
        }


        System.out.println(maxLength * maxLength);
    }


}
