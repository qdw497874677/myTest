package com.qdw.alibaba;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.alibaba
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/15 0015 19:02
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
//        System.out.println(~(a));
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        while (k-->0){
            if ("0".equals(s)){
                if(k%2==0){
                    System.out.println("0");
                }else {
                    System.out.println("1");
                }

                return;
            }
            s = m(s);
        }
        System.out.println(s);
    }
    public static String m(String s){

        s = s.replace("0","2");
        s = s.replace("1","0");
        s = s.replace("2","1");
//        System.out.println(s);
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.charAt(i)=='1'){
                break;
            }
        }
        if (i==s.length()){
            return "0";
        }
        s = s.substring(i);
        return s;
//        StringBuilder res = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)=='1' && res.length()!=0){
//                res.append(0);
//            }else if (s.charAt(i)=='0'){
//                res.append(1);
//            }
//        }
//        return res.toString();
    }
}
