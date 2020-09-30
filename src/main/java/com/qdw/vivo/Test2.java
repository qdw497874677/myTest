package com.qdw.vivo;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.vivo
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/12 0012 20:22
 */
public class Test2 {
    static int target;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean check = check(s, 0, s.length() - 1, true);
        StringBuilder res = new StringBuilder(s);
        System.out.println(check?res.deleteCharAt(target):check);
    }
    public static boolean check(String s,int i,int j,boolean flag){
        if (i>=j){
            return true;
        }
        if(s.charAt(i)==s.charAt(j)){
            return check(s,i+1,j-1,flag);
        }else if (flag){
            boolean check = check(s, i + 1, j, false);
            if (check){
                target = i;
                return true;
            }
            boolean check1 = check(s, i, j - 1, false);
            if (check1){
                target = j;
                return true;
            }
        }
        return false;
    }
}
