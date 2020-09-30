package com.qdw.xiaohongshu;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.xiaohongshu
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/12 0012 11:00
 */
public class Test2 {
    static int solution(String s) {
//        int res = 0;
//        int n = s.length();
//        int[] arr = new int[256];
//        for(int i=0;i<n;i++){
//            arr[s.charAt(i)-'a']++;
//        }
//        for(int i=0;i<n;i++){
//            res += (arr[i]*(arr[i]+1))/2;
//        }
//        return res;

       if (s==null||s.length()==0){
           return 0;
       }
       int n = s.length();
       int[] dp = new int[s.length()];
        for (int i = 0; i < n; i++) {
            dp[i] = i+1;
        }
        for (int i = 1; i < s.length(); i++) {

            if (check(s.substring(0,i))){
                dp[i]=i;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (check(s.substring(j+1,i))){
                    dp[i] = Math.min(dp[i],dp[j]+1);
                }
            }
        }
        return dp[s.length()-1];


    }
    static boolean check(String s){
        if (s.length()<1){
            return false;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return true;
        }
        return false;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _s;
        try {
            _s = in.nextLine();
        } catch (Exception e) {
            _s = null;
        }

        res = solution(_s);
        System.out.println(String.valueOf(res));

    }
}
