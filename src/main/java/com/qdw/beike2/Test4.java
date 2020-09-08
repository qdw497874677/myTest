package com.qdw.beike2;

import java.util.Map;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.beike2
 * @ClassName: Test4
 * @Description:
 * @date: 2020/9/7 0007 15:46
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        int[] arr1 = new int[2*n];
        int[] arr2 = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            arr1[i] = Integer.parseInt(s1[i]);
            arr2[i] = Integer.parseInt(s2[i]);
        }
        int left = n-1;
        int right = n;
        int h = 0;
        int min = Integer.MAX_VALUE;
        while(left>=0 || right<2*n){
            if (left<0){
                h -= arr1[right];
                min = Math.min(h,min);
                h += arr2[right++];
                continue;
            }
            if (right>=2*n){
                h -= arr1[left];
                min = Math.min(h,min);
                h += arr2[left--];
                continue;
            }
            if(arr1[left]>arr1[right]){
                h -= arr1[right];
                min = Math.min(h,min);
                h += arr2[right++];
            }else if (arr1[left]<arr1[right]){
                h -= arr1[left];
                min = Math.min(h,min);
                h += arr2[left--];
            }
        }
        System.out.println(-min+1);
    }
}
