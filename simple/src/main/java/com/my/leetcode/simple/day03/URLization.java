package com.my.leetcode.simple.day03;

/**
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 * （注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 */
public class URLization {

    public static String replaceSpaces1(String S, int length) {
        if ("".equals(S) || S == null){
            return S;
        }
        char[] chars = new char[length*3];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if ( c == ' '){
                chars[index++] = '%';
                chars[index++] = '2';
                chars[index++] = '0';
            }else {
                chars[index++] = c;
            }
        }
        return new String(chars).trim();
    }

    public static String replaceSpaces(String S, int length) {
        char[] chs = new char[S.length()];
        int charLength = 0;
        for (int i = 0; i < length; i++) {
            char c = S.charAt(i);
            if ( c == ' '){
                chs[charLength++] = '%';
                chs[charLength++] = '2';
                chs[charLength++] = '0';
            }else {
                chs[charLength++] = c;
            }
        }
        return new String(chs,0,charLength);
    }
    public static void main(String[] args) {
        System.out.println(replaceSpaces("Mr John Smith    ", 13));
    }
}
