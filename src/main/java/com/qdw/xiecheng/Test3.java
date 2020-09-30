package com.qdw.xiecheng;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.xiecheng
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/8 0008 20:35
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            sc.nextLine();
        }
        Random random = new Random();
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,16);
        map.put(2,12);
        map.put(3,4);
        map.put(4,2);
        System.out.println(map.get(random.nextInt(5)));
//        System.out.println(16);
    }
}
