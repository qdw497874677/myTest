package com.qdw.shence;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.shence
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/21 0021 16:31
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag = 1;
        if (a>=n){
            return;
        }

        while (b-->0){

            System.out.println(arr[a]);
            a += flag;
            if (a==n || a==-1){
                flag = -flag;
                a += 2*flag;
            }

        }
    }

}
