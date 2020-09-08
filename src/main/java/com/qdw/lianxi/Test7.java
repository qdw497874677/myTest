package com.qdw.lianxi;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test3
 * @Description:
 * @date: 2020/8/13 0013 21:46
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();
        while (n>0){
            n--;
            String s = sc.nextLine();
            System.out.println(Method(s));
        }
    }
    public static String Method(String s){
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int j = 0; j < chars.length; j++) {
            chars[i] = chars[j];
            if (i>=2 && chars[i-2]==chars[i-1] & chars[i-1]==chars[i]){
                continue;
            }
            if (i>=3 && chars[i-3]==chars[i-2] && chars[i-1]==chars[i]){
                continue;
            }
            sb.append(chars[i]);
            i++;
        }
        return sb.toString();
    }


}
