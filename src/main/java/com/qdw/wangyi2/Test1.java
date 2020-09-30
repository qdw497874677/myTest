package com.qdw.wangyi2;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.wangyi2
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/13 0013 9:56
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int i = 0;
        int j = 0;
        int l = 0;
        int r = 0;
        int max = -1;
        while(j<arr.length){
            if(arr[j]==0){
                if(j-i>max){
                    max = j-i;
                    l = i;
                    r = j;
                }
                j++;
            }else {
                j++;
                i = j;
            }

        }
        if (l==0 || r==arr.length-1){
//            System.out.println("!!!");
            System.out.println(r-l+1);
            return;
        }
        System.out.println((r-l)/2+1);
//        System.out.println(l+" "+r);
    }
}
