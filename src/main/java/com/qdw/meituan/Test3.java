package com.qdw.meituan;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.meituan
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/20 0020 10:03
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (n<m){
            int temp = n;
            n = m;
            m = temp;
            String t = s1;
            s1 = s2;
            s2 = t;
        }
        int[] arr = new int[m];
        int dfs = dfs(s1, s2, 0, 0, 0);
        if (dfs>0){
            System.out.println("YES");
            System.out.println(dfs);
        }else {
            System.out.println("NO");
        }

    }
    public static int dfs(String s1,String s2,int index,int cur,int sum){
        if (s1.length()-cur<s2.length()-index){
            return -1;
        }
        if (index>=s2.length()){
            return sum;
        }
        for (int i = cur; i < s1.length(); i++) {
            if (s1.charAt(cur)==s2.charAt(index)){
                int dfs = dfs(s1, s2, index + 1, i + 1, sum + i);
                if (dfs>0){
                    return dfs;
                }
            }
        }
        return -1;
    }
}
