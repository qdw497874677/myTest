package com.qdw.xiecheng;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.xiecheng
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/8 0008 19:37
 */
public class Test2 {
    static boolean[] used;
    static String[] s;
    public static void main(String[] args) {
        System.out.println(Character.isLetter('!'));
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine().split(" ");
        if (s==null||s.length==0){
            return;
        }
        used = new boolean[256];
        dfs(s.length,0,new StringBuilder(),false);
    }
    public static void dfs(int n,int index,StringBuilder sb,boolean flag){
        if (index == n){
            if (flag){
                System.out.println(sb+"--circular dependency");
            }else {
                System.out.println(sb);
            }
            return;
        }
        String ss = s[index];
        for (int i = 0; i < ss.length(); i++) {
            char cc = ss.charAt(i);
            if (!((cc>='A'&&cc<='Z')||(cc>='a'&&cc<='z'))){
                continue;
            }
            sb.append(cc);
            boolean temp = used[cc];
            used[cc] = true;
            dfs(n,index+1,sb,temp||flag);
            sb.deleteCharAt(sb.length()-1);
            used[cc] = temp;
        }
    }
}
