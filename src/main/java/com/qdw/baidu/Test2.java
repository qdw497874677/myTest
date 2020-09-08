package com.qdw.baidu;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.baidu
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/3 0003 19:38
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            t--;
            int n = sc.nextInt();
            int[] arr = new int[n];
            int m = sc.nextInt();
            int mm = m;
            sc.nextLine();
            while(mm>0){
                mm--;
                int k = sc.nextInt();
                while(k>0){
                    k--;
//                    String[] ss = sc.nextLine().split(" ");
//                    int i = Integer.parseInt(ss[0]);
//                    int j = Integer.parseInt(ss[1]);
                    int i = sc.nextInt();
                    int j = sc.nextInt();
                    arr[i-1]++;
                    if(j<n){
                        arr[j]--;
                    }
//                    while(i<=j){
//                        arr[i-1]++;
//                        i++;
//                    }

                }

            }
            for (int i = 1; i < n; i++) {
                arr[i] += arr[i-1];
            }
            for (int i : arr) {
                System.out.print(i+" ");
            }

            List<Integer> res = new ArrayList<>();
            for (int i=0;i<n;i++) {
                if(arr[i]==m){
                    res.add(i+1);
                }
            }
            System.out.println(res.size());
            for (Integer re : res) {
                System.out.print(re+" ");
            }
        }
    }
}
