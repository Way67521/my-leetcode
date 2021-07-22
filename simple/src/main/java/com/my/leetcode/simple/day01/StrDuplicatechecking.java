package com.my.leetcode.simple.day01;

import java.util.HashMap;
import java.util.Map;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同
 * 备注：
 1. 0 <= len(s) <= 100
 2. 如果你不使用额外的数据结构，会很加分。
 */
public class StrDuplicatechecking {

    public static void main(String[] args) {
        String str = "abccdefg";
        boolean unique = isUniqueMap(str);
        System.out.println(unique);
    }
    public static boolean isUniqueForeach(String str) {
        if ("".equals(str)||str == null){
            return false;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i != j && chars[i]==chars[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isUniqueMap(String str) {
        if ("".equals(str)||str == null){
            return false;
        }
        Map<Character, Boolean> strMap = new HashMap<Character, Boolean>(128);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Boolean value = strMap.get(chars[i]);
            if (value!= null && value){
                return false;
            }
            strMap.put(chars[i],Boolean.TRUE);
        }
        return true;
    }
}


