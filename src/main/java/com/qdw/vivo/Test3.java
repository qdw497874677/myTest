package com.qdw.vivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.vivo
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/12 0012 20:03
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1,s.length()-1);
        String[] s1 = s.split(",");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        boolean[] used = new boolean[arr.length];
        List<String> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<String> list = new ArrayList<>();
            dfs(list,arr,used,i);
            res.addAll(list);
        }
        System.out.println("\""+String.join(",",res)+"\"");

    }
    public static void dfs(List<String> list, int[] arr, boolean[] used, int index){
        if (used[index]){
            return;
        }
        if(arr[index]==-1){
            used[index] = true;
            list.add(index+"");
            return;
        }
        used[index] = true;
        dfs(list,arr, used, arr[index]);
        list.add(index+"");

    }
}
