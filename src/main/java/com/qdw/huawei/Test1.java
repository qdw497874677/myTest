package com.qdw.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.huawei
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/6 0006 18:42
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = -1;
        String target = "";
        boolean flag = false;
        while(sc.hasNext()){
            String s = sc.nextLine();
            if (s.length()==1){
                flag = true;
            }
            if(!flag){
                list.add(s);
            }else{
                n = Integer.parseInt(s);
                break;
            }
        }
        target = sc.nextLine();
        method(list,n,target);
    }
    public static void method(List<String> list,int n,String target){
        StringBuilder targetS = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i)-'0'<n){
                targetS.append(target.charAt(i));
            }
        }

        for (String s : list) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)-'0'<n){
                    sb.append(s.charAt(i));
                }
            }
            if (check(sb.toString(),targetS.toString())){
                System.out.println(s);
            }

        }
    }
    public static boolean check(String a,String b){
        return a.contains(b);
    }
}
