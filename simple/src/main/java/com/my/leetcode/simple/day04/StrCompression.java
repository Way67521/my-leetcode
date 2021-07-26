package com.my.leetcode.simple.day04;


/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。
 * 若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * @author Way
 */
public class StrCompression {
    public static String compressString(String S) {
        if ("".equals(S) || S==null){
            return S;
        }
        char[] chars = S.toCharArray();
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i-1]){
                int counts = i-j;
                j = i;
                stringBuilder.append(chars[i-1]).append(counts);
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(chars.length-j);
        if (stringBuilder.length()>=S.length()){
            return S;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String aabcccccaaa = compressString("bb");
        System.out.println(aabcccccaaa);
    }
}
