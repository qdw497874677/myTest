package com.qdw.duxiaoman;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.duxiaoman
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/20 0020 20:24
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] arr = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (arr[s2.charAt(i)]>0){
                arr[s2.charAt(i)]--;
                count++;
            }
        }
        System.out.println(count);
    }
}
