package com.qdw.meituan;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.meituan
 * @ClassName: Test33
 * @Description:
 * @date: 2020/9/20 0020 11:13
 */
public class Test33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (n<m){
            int temp = n;
            n = m;
            m = temp;
            String t = s1;
            s1 = s2;
            s2 = t;
        }
        int i=0;
        int j=0;
        int res = 0;
        while (j<s2.length()){
            char c2 = s2.charAt(j);
            boolean flag = true;
//            if (n-i+1<m-j){
//                System.out.println("No");
//                return;
//            }
            for (int k = i; k < s1.length(); k++) {
                char c1 = s1.charAt(k);
                if (c1==c2){
                    res += k+1;
                    flag = false;
                    i = k+1;
                    j++;
                    break;
                }
            }
            if (flag){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        System.out.println(res);
    }
}
