package com.qdw.jianxinjinrong;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.jianxinjinrong
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/12 0012 19:26
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()<3){
            System.out.println(s);
            return;
        }
        s = s.replace("coc","");
        System.out.println(s);
    }
}
