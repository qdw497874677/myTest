package com.qdw.lianxi;

import java.util.*;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test10
 * @Description:
 * @date: 2020/8/16 0016 17:32
 */
public class Test12 {
    public static void main(String[] args){
        Deque<Integer> deque = new LinkedList<>();
        Set<String> set = new HashSet<>();
        char[] chars = new char[10];
        Arrays.sort(chars);
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("-");
        String[] s1 = s[0].split(" ");
        String[] s2 = s[0].split(" ");
        if (isWang(s1) || isWang(s2)){
            System.out.println("joker JOKER");
            return;
        }
        if (isZha(s1) && isZha(s2)){
            if (s1[0].charAt(0)<s2[0].charAt(0)){
                System.out.println(print(s2));
                return;
            }else {
                System.out.println(print(s1));
                return;
            }
        }
        if (isZha(s1)){
            System.out.println(print(s1));
            return;
        }
        if (isZha(s2)){
            System.out.println(print(s2));
            return;
        }
        if (isShunzi(s1) && isShunzi(s2)){
            if (Integer.parseInt(s1[0])>Integer.parseInt(s2[0])){
                System.out.println(print(s1));
                return;
            }else {
                System.out.println(print(s2));
                return;
            }
        }
        if (isSan(s1) && isSan(s2)){
            System.out.println(Integer.parseInt(s1[0])>Integer.parseInt(s2[0])?print(s1):print(s2));
            return;
        }
        if (isDui(s1) && isDui(s2)){
            System.out.println(Integer.parseInt(s1[0])>Integer.parseInt(s2[0])?print(s1):print(s2));
            return;
        }
        if (isDan(s1) && isDan(s2)){
            System.out.println(Integer.parseInt(s1[0])>Integer.parseInt(s2[0])?print(s1):print(s2));
            return;
        }

        System.out.println("ERROR");




    }
    static public boolean isDan(String[] s){
        return s.length == 1;
    }
    static public boolean isDui(String[] s){
        return s.length == 2 && s[0].equals(s[1]);
    }
    static public boolean isSan(String[] s){
        if (s.length==3 && s[0].equals(s[1]) && s[1].equals(s[2])){
            return true;
        }
        return false;
    }
    static public boolean isShunzi(String[] s){
        if (s.length>=5){
            for (int i = 1; i < s.length; i++) {
                if(Integer.parseInt(s[i-1])+1 != Integer.parseInt(s[i]) ){
                    return false;
                }

            }
        }
        return true;
    }
    static public boolean isZha(String[] s){
        if ("joker".equals(s[0].toLowerCase())){
            return true;
        }
        return false;
    }
    static public boolean isWang(String[] s){
        return s[0].equals(s[1]) && s[1].equals(s[2]) && s[2].equals(s[3]);
    }
    static public String print(String[] s){
        StringBuilder res = new StringBuilder();
        for (String s1 : s) {
            res.append(s1).append(" ");
        }
        return res.toString();
    }

}
