package com.qdw.vipkid;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.vipkid
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/24 0024 19:20
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        if (k>s.length){
            System.out.println();
            return;
        }
        int sum = 0;
        int i = 0;
        if (k==0){
            System.out.println();
            return;
        }
        for (; i < k; i++) {
            sum += arr[i];
        }
        int j = 0;
        int a = 0;
        int b = i-1;
        int min = sum;
        for(;i<s.length;i++){
            sum += (arr[i]-arr[j++]);
//            System.out.println("sum:"+sum+"  min"+min);
//            System.out.println(i);
//            System.out.println(sum+" "+x+" "+(sum-x)+" sum:"+Math.abs(sum-x)+"  min"+Math.abs(min-x));
            if (Math.abs(sum-x)<Math.abs(min-x)){
                a = j;
                b = i;
                min = sum;
            }
        }
//        System.out.println(a+" "+b);
//        if (b==s.length){
//            for (int l = b-k-1; l < b; l++) {
//                System.out.println(arr[l]+" ");
//            }
//        }
        for (int l = a; l <= b; l++) {
            System.out.print(arr[l]+" ");
        }
    }
}
