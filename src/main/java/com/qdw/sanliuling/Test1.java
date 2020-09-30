package com.qdw.sanliuling;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.sanliuling
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/26 0026 19:43
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            int v = sc.nextInt();
            int res = 0;
            while (a>0){
                if (b>0){
                    if (k-1<b){
                        b -= (k-1);
                        a -= k*v;
                    }else {
                        a -= (b+1)*v;
                        b = 0;
                    }
                }else {
                    a -= v;
                }
                res++;
            }
            System.out.println(res);
        }
    }
}
