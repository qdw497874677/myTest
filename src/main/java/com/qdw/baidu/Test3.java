package com.qdw.baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.baidu
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/3 0003 20:01
 */
public class Test3 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        dfs(n,arr,new ArrayList<>(),0);
        System.out.println(count);
    }
    public static void dfs(int n, int[] arr, List<Integer> list,int sum){
        if(sum==n){
            count++;
            return;
        }else if (sum>n){
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if(list.size()>=1 && list.get(list.size()-1)==arr[i]){
                continue;
            }
            if (list.size()>=2 && list.get(list.size()-2)==arr[i]){
                continue;
            }
            list.add(arr[i]);
            dfs(n,arr,list,sum+arr[i]);
            list.remove(list.size()-1);
        }
    }
}
