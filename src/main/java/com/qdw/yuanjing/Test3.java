package com.qdw.yuanjing;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.yuanjing
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/9 0009 13:35
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = 1;
        int count = 0;
        while(n>0){
            a *= n;
            if(a%10==0){
                count++;
                a /= 10;
            }
            n--;
        }
        System.out.println(count);
    }
}
