package com.qdw.pinduoduo;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.pinduoduo
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/1 0001 19:02
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = n/4;
//        int a1 = 1+n%2;
        int b = (n+1)%2;
        int y = n/2;
        int x = n/2;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i<y){
                    if(j<x){
                        if(i>j){
                            res[i][j] = 3;
                        }else if (i<j){
                            res[i][j] = 2;
                        }
                    }else if (j>=x){
                        if(i<(n-j-1)){
                            res[i][j] = 1;
                        }else if (i>(n-j-1)){
                            res[i][j] = 8;
                        }
                    }
                }else if (i>=y){
                    if(j<x){
                        if((n-i-1)>j){
                            res[i][j] = 4;
                        }else if ((n-i-1)<j){
                            res[i][j] = 5;
                        }
                    }else if (j>=x){
                        if(i>j){
                            res[i][j] = 6;
                        }else if (i<j){
                            res[i][j] = 7;
                        }
                    }
                }
            }
        }
        if (n%2==1){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i==x || j==x){
                        res[i][j] = 0;
                    }

                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
