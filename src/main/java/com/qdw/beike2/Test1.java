package com.qdw.beike2;

import javax.swing.plaf.IconUIResource;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @PackageName:com.qdw.beike2
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/7 0007 15:03
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] ss = new String[n][4];
        for(int i=0;i<n;i++){
            String[] s = sc.nextLine().split(" ");
            if (s.length!=4){
                continue;
            }
            ss[i] = s;
        }
        for(int i=0;i<n;i++){
            method(ss[i]);
        }
    }
    public static void method(String[] s){
        if (s==null || s.length!=4){
            return;
        }
        int left = (check(s[0],s[2])+check(s[0],s[3]));
        int right = (check(s[1],s[2])+check(s[1],s[3]));
        if (left==right){
            System.out.println("same");
        }else if(left>right){
            System.out.println("left");
        }else {
            System.out.println("right");
        }
    }
    public static int check(String a,String b){
        if("J".equals(a) && "B".equals(b)){
            return 1;
        }else if("S".equals(a) && "J".equals(b)){
            return 1;
        }else if("B".equals(a) && "S".equals(b)){
            return 1;
        }
        return 0;
    }
}
