package com.qdw.meituan;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.meituan
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/20 0020 10:00
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int count = 0;
        for (int i = n+1; i < m; i++) {
            String ss = String.valueOf(i);
            if (!check(ss)){
                continue;
            }
            int a = Integer.parseInt(ss.substring(0,2));
            int b = Integer.parseInt(ss.substring(2,4));
            int c = Integer.parseInt(ss.substring(4,6));
            if (a+b==c){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(String s){
        boolean[] arr = new boolean[10];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (arr[c-'0']){
                return false;
            }else {
                arr[c-'0'] = true;
            }
        }
        return true;
    }
}
