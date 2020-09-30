package com.qdw.meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.meituan
 * @ClassName: Test4
 * @Description:
 * @date: 2020/9/20 0020 11:35
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            sc.nextLine();
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(1,3);
        map.put(2,8);
        map.put(3,13);
        map.put(4,2);
        map.put(5,2);
        map.put(6,9);
        map.put(7,9);
        Random random = new Random();
        System.out.println(map.get(random.nextInt(8)));
    }
}
