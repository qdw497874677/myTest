package com.qdw.jinshanyun;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.jinshanyun
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/23 0023 21:58
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 5; i <= n; i++) {
            int a = i;
            String s = String.valueOf(a);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)=='5'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
