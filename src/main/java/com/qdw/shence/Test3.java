package com.qdw.shence;

import java.util.*;

/**
 * @PackageName:com.qdw.shence
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/21 0021 16:49
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(",");

        if (s.length==0){
            System.out.println(0);
            return;
        }else if (s.length==1){
            System.out.println(s[0]);
            return;
        }
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int n = s.length/2;
        Arrays.sort(arr);
        if (s.length%2==0){
            System.out.println((arr[n-1]+arr[n])/2.0);
        }else {
            System.out.println(arr[n]);
        }

    }
}
