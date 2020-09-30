package com.qdw.xinlang;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.xinlang
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/13 0013 16:10
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0;
        boolean[] visited = new boolean[256];
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (visited[aChar]){
                System.out.println(false);
                return;
            }
            visited[aChar] = true;
        }
        System.out.println(true);

    }
}
