package com.qdw.jingdong;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @PackageName:com.qdw.jingdong
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/17 0017 19:24
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s += "x";
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        List<String> res = new ArrayList<>();
//        String pattern = "[^0-9]([1-3][0-9][0-9][0-9])[^0-9]";
//        Pattern complie = Pattern.compile(pattern);
//        Matcher m = complie.matcher(s);
//        while (m.find()){
//            res.add(m.group(1));
//        }
//        for (int k = 0; k < res.size(); k++) {
//            System.out.print(res.get(k));
//            if (k!=res.size()){
//                System.out.print(" ");
//            }
//        }
//        System.out.println();

        while (j<s.length()){
            if (!Character.isDigit(s.charAt(j))){
                if (j-i==4){
                    int a = Integer.parseInt(s.substring(i, i+4));
                    if (a<=3999 && a>=1000){
                        list.add(a);
                        set.add(a);
                    }
                }
                i = j+1;
            }
            j++;
        }
        int k = 0;
        if (set.isEmpty()){
            return;
        }
        for (Integer integer : set) {

            System.out.print(integer);
            if (k!=set.size()-1){
                System.out.print(" ");
            }
        }
        System.out.println();
//        for (int k = 0; k < list.size(); k++) {
//            System.out.print(list.get(k));
//            if (k!=list.size()-1){
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
    }
}
