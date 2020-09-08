package com.qdw.lianxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test3
 * @Description:
 * @date: 2020/8/13 0013 21:46
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        int i = 0;
        int j = 2;
        while(i<n-2){
            while(j<n && arr[j]-arr[i]<=d){
                j++;
            }
            if (j-1-i>=2){
                int num = j-1-i;
                res += num*(num-1)/2;
            }
            i++;
        }
        System.out.println(res%99997867);
    }
    public int method(int[] arr,int d){
        int n = arr.length;
        int res = 0;
        int i = 0;
        int j = 2;
        while(i<n-2){
            while(j<n && arr[j]-arr[i]<=d){
                j++;
            }
            if (j-1-i>=2){
                int num = j-1-i;
                res += num*(num-1)/2;
            }
            i++;
        }
        return res;
    }
}
