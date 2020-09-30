package com.qdw.jianxinjinrong;

import java.util.*;

/**
 * @PackageName:com.qdw.jianxinjinrong
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/12 0012 19:30
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.substring(1,s1.length()-1);
        s2 = s2.substring(1,s2.length()-1);
        Map<String,Integer> map = new HashMap<>();
        String[] split1 = s1.split(" ");
        String[] split2 = s2.split(" ");
        for (String s : split1) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for (String s : split2) {
            map.put(s,map.getOrDefault(s,0)+1);
        }

        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s)==1){
                list.add("\""+s+"\"");
            }
        }
        System.out.println("["+String.join(",",list)+"]");
    }
}
