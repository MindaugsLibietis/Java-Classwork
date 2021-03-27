package com.rcs.classwork.Day16Classes;

public class StringUtils {
    public static String getMiddle(String teksts) {
        int beginIndex;
        int endIndex;
        if (teksts.length() %2 == 0){
            beginIndex = (teksts.length() / 2) -1;
            endIndex = beginIndex + 2;
        } else {
            beginIndex = teksts.length() / 2;
            endIndex = beginIndex + 1;
        }
        return teksts.substring(beginIndex, endIndex);
    }
    public static String getReverse(String teksts) {
        String newText = "";
        for (int i = teksts.length() -1; i >= 0; i --){
            newText += teksts.substring(i, i + 1);
            // newText += teksts.charAt(i);
        }
        return newText;
    }

    public static boolean isPalindrome (String teksts) {
        return teksts.equalsIgnoreCase(getReverse(teksts));
    }
}
