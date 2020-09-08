package com.qdw.beike2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.beike2
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/7 0007 16:32
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,2);
        map.put(1,6);
        map.put(2,14);
        map.put(3,22);
        Random random = new Random();
        int i1 = map.get(random.nextInt(4));
        boolean flag = true;
        while (flag){
            if (s.length()>i1){
                System.out.println(s.length()-i1);
                flag = false;
            }
            i1 = map.get(random.nextInt(4));
        }
    }
}
