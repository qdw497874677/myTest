package com.qdw.lianxi;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test1
 * @Description:
 * @date: 2020/8/12 0012 23:10
 */
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        while(sc.hasNextInt()){
//            n--;
            int m = sc.nextInt();
            int res = 0;
            while(m>=2){
                if(m==2){
                    res += 1;
                    break;
                }else{
                    int a = m/3;;
                    int b = m%3;
                    res += a;
                    m = a + b;
                }
            }
            System.out.println(res);
        }
    }
}
