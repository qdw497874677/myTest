package com.qdw.beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.beike
 * @ClassName: Test2
 * @Description:
 * @date: 2020/8/11 0011 19:02
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int maxSum = 0;
        int minLength = n;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum |= arr[j];
                if (sum>=maxSum){
                    if (sum>maxSum){
                        maxSum = sum;
                        minLength = j-i+1;
                    }else {
                        minLength = Math.min(minLength,j-i+1);
                    }
                }
            }
        }
        System.out.println(minLength);

    }
}
