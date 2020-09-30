package com.qdw.didi;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.didi
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/13 0013 19:30
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int i = 0;
        int j = i+n-1;
        StringBuilder res = new StringBuilder();
        while (i<s.length()){
            if (j>=s.length()){
                j = s.length()-1;
            }
            for (int k = j; k >= i; k--) {
                res.append(s.charAt(k));
            }
            i += n;
            j = i+n-1;
        }
        System.out.println(res);

    }
}
