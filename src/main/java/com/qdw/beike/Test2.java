package com.qdw.beike;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.beike
 * @ClassName: Test2
 * @Description:
 * @date: 2020/8/11 0011 19:02
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] res = new int[t];
        sc.nextLine();
        int i = 0;
        while (t!=0){
            t--;
            String[] s = sc.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            if (n==0 || m==0){
                i++;
                continue;
            }
            if(n==1 && m==1){
                res[i++]=1;
                continue;
            }
            if (n%2==0 && m%2==0){
                res[i++]=2;
                continue;
            }
            // 如果其中一个为1，另外一个为奇数
            if (n==1 || m==1){
                res[i++] = Math.max(m, n);
            }else {
                res[i++] = 3;
            }
        }
        for (int re : res) {
            System.out.println(re);
        }
    }
}
