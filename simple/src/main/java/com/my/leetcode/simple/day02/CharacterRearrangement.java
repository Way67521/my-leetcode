package com.my.leetcode.simple.day02;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 */
public class CharacterRearrangement {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "bc";
        System.out.println(checkPermutationMap1(s1, s2));
    }

    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00% 的用户
     * 内存消耗：36 MB, 在所有 Java 提交中击败了77.55% 的用户
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkPermutationMap1(String s1, String s2) {
        if (s1 == null || s2 == null){
            return false;
        }
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character,Integer> dataMap = new HashMap(128);
        char[] chars1 = s1.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            Integer charCounts1 = dataMap.get(chars1[i]);
            if (charCounts1 == null){
                charCounts1 = 1;
            }else {
                charCounts1 += 1;
            }
            dataMap.put(chars1[i],charCounts1);
        }
        Map<Character,Integer> dataMap2 = new HashMap(128);
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            Integer charCounts2 = dataMap2.get(chars2[i]);
            if (charCounts2 == null){
                charCounts2 = 1;
            }else {
                charCounts2 += 1;
            }
            dataMap2.put(chars2[i],charCounts2);
        }
//        for (int i = 0; i < chars2.length; i++) {
//            Integer charCounts2 = dataMap.get(chars2[i]);
//            if (charCounts2 != null){
//                charCounts2 -= 1;
//                dataMap.put(chars2[i],charCounts2);
//            }
//        }
        if (dataMap == null || !dataMap.equals(dataMap2)){
            return false;
        }
//        for (Map.Entry<Character, Integer> characterIntegerEntry : dataMap.entrySet()) {
//            Integer value = characterIntegerEntry.getValue();
//            if (!new Integer(0).equals(value)){
//                return false;
//            }
//        }
        return true;
    }

    /**
     * 执行用时: 0 ms
     * 内存消耗: 36.2 MB
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkPermutationMap2(String s1, String s2) {
        if (s1 == null || s2 == null){
            return false;
        }
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character,Integer> dataMap = new HashMap(128);
        char[] chars1 = s1.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            Integer charCounts1 = dataMap.get(chars1[i]);
            if (charCounts1 == null){
                charCounts1 = 1;
            }else {
                charCounts1 += 1;
            }
            dataMap.put(chars1[i],charCounts1);
        }
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            Integer charCounts2 = dataMap.get(chars2[i]);
            if (charCounts2 != null){
                charCounts2 -= 1;
                dataMap.put(chars2[i],charCounts2);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : dataMap.entrySet()) {
            Integer value = characterIntegerEntry.getValue();
            if (!new Integer(0).equals(value)){
                return false;
            }
        }
        return true;
    }

}
