package com.qdw.qunaer;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.qunaer
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/23 0023 19:57
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m==0||n==0||m<n){
            System.out.println(0);
            return;
        }
        long a = 1;
        long b = 1;
        for (int i = 0; i < n; i++) {
            a *= m--;
            if (a%(i+1)==0){
                a /= (i+1);
            }else {
                b *= (i+1);
                long gcd = GCD(a, b);
                a /= gcd;
                b /= gcd;
            }
        }


        System.out.println(a/b);
    }
    public static long GCD(long m,long n){
        long res = 0;
        while (n!=0){
            res = m%n;
            m = n;
            n = res;
        }
        return m;
    }
}
