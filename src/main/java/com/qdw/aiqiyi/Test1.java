package com.qdw.aiqiyi;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.aiqiyi
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/13 0013 14:59
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        int j = 0;
        int[] arr = new int[256];
        int res = 0;
        while(j<s.length()){
            char c = s.charAt(j);
            if(arr[c]==0){
                arr[c]++;
                j++;
                res = Math.max(res,j-i);
            }else{
                arr[s.charAt(i++)]--;
            }
        }
        System.out.println(res);
    }
}
