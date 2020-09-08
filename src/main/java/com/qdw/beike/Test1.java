package com.qdw.beike;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.beike
 * @ClassName: Test1
 * @Description:
 * @date: 2020/8/11 0011 19:02
 */
public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int i = 0;
        int j = s.length()-1;
        int count = 0;
        while(i<j){
            if (s.charAt(i)!=s.charAt(j)){
                count++;
            }
            i++;j--;
        }
        System.out.println(count);
    }
}
