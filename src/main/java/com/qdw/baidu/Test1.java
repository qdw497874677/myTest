package com.qdw.baidu;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.baidu
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/3 0003 19:29
 */
public class Test1 {
    static StringBuilder res = new StringBuilder();
    static long max = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[n];
        int size5 = 0;
        int size0 = 0;
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(s[i]);
            if (arr[i]==5){
                size5++;
            }else {
                size0++;
            }
        }
        dfs(size5,size0);
        System.out.println(max);
    }
    public static void dfs(int size5,int size0){
        if (res.length()>2){
            long l = Long.parseLong(res.toString());
//            System.out.println(l+" "+l%90);
            System.out.println(l);
            if(l%90==0){
                max = Math.max(max,l);
            }
        }

        if (size5>0){
            size5--;
            res.append(5);
            dfs(size5,size0);
            res.deleteCharAt(res.length()-1);
            size5++;
        }
        if (size0>0){
            size0--;
            res.append(0);
            dfs(size5,size0);
            res.deleteCharAt(res.length()-1);
            size0++;
        }
    }
}
