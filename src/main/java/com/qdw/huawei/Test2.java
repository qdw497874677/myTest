package com.qdw.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.huawei
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/6 0006 18:43
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(";");
        String src = s[0];
        String target = s[1];
        method(src,target);
    }
    public static void method(String src,String target){
        String[] s = src.split(" ");
        src = "I need book.";
        List<String> listS = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < src.length(); i++) {
            if(src.charAt(i)==' '){
                listS.add(src.substring(k,i).toLowerCase());
                k = i+1;
            }else if(src.charAt(i)==','||src.charAt(i)=='.'||src.charAt(i)=='!'||src.charAt(i)=='?'){
                listS.add(src.substring(k,i).toLowerCase());
                listS.add(String.valueOf(src.charAt(i)));
                k = i+1;
            }
        }
        List<String> listT = new ArrayList<>();
        k = 0;
//        for (String list : listS) {
//            System.out.println(list);
//        }
        for (int i = 0; i < target.length(); i++) {
            if(target.charAt(i)==' '){
                listT.add(target.substring(k,i).toLowerCase());
                k = i+1;
            }else if(target.charAt(i)==','||target.charAt(i)=='.'||target.charAt(i)=='!'||target.charAt(i)=='?'){
                listT.add(target.substring(k,i).toLowerCase());
                listT.add(String.valueOf(target.charAt(i)));
                k = i+1;
            }
        }

//        String[] t = target.split(" ");
        int n = listS.size();
        int m = listT.size();
        if (n*m==0){
            System.out.println("("+(n+m)+","+m+")");
        }
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i < m + 1; i++) {
            dp[0][i] = i;
        }
//        System.out.println("m:"+m);
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int left = dp[i-1][j] + 1;
                int down = dp[i][j-1] + 1;
                int ld = dp[i-1][j-1];
//                if(!s[i-1].equals(t[j-1])){
                if(!check(listS.get(i-1),listT.get(j-1))){
                    ld += 1;
                }
                dp[i][j] = Math.min(left,Math.min(down,ld));
            }
        }
//        System.out.println(dp[n][m]);
        System.out.println("("+dp[n][m]+","+m+")");
    }
    public static boolean check(String a,String b){
        if (a.length()!=b.length()){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            char ac = a.charAt(i);
            char bc = b.charAt(i);
            if(ac!=bc){
                if(!(ac==','||ac=='.'||ac=='!')&&(bc==','||bc=='.'||bc=='!')){
                    return false;
                }
            }
        }
        return true;
    }
}
