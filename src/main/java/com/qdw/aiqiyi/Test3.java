package com.qdw.aiqiyi;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @PackageName:com.qdw.aiqiyi
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/13 0013 15:24
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = s.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        List<List<Integer>> res = new LinkedList<>();
        int i = 0;
        int j = 0;
        for (int k = 0; k < n; k++) {
            if(arr[k]>0){
                print(res);
                return;
            }
            if (k>0&&arr[k-1]==arr[k]){
                continue;
            }
            i = k+1;
            j = n-1;
            int temp = 0;
            while(i<j){
                temp = arr[i] + arr[j] + arr[k];
                if(temp==0){
                    res.add(Arrays.asList(arr[k],arr[i],arr[j]));
                    while(i<j && arr[i+1]==arr[i]){
                        i++;
                    }
                    while(i<j && arr[j-1]==arr[j]){
                        j--;
                    }
                    i++;
                    j--;
                }else if(temp<0){
                    i++;
                }else {
                    j--;
                }
            }

        }
        print(res);
    }
    public static void print(List<List<Integer>> res){
        for (List<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}
