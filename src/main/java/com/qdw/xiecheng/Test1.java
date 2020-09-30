package com.qdw.xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @PackageName:com.qdw.xiecheng
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/8 0008 18:36
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String s = sc.nextLine();
        String tar = sc.nextLine();

        int l = 0;
        int r = 0;
        StringBuilder sb = new StringBuilder();
        s = s+" ";
        while(r<s.length()){
            String substring = "";
            char c = s.charAt(r);
//            System.out.print(c);
            if (!((c>='A'&&c<='Z')||(c>='a'&&c<='z'))){
                substring = s.substring(l, r);
                l = r+1;
                if (check(src,substring)){
                    substring = tar;
                }
//                System.out.println(c+" "+substring);
                sb.append(substring+c);
            }
//            list.add(substring+src.charAt(r));
            r++;
        }
        System.out.println(sb);

    }
    public static boolean check(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }
//        System.out.println("a:"+a+" b:"+b);
        int[] arr = new int[256];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)]++;
        }
        for (int i = 0; i < b.length(); i++) {
            arr[b.charAt(i)]--;
        }
        for (int i : arr) {
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
