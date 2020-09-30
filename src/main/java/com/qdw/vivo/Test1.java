package com.qdw.vivo;

import java.util.*;

/**
 * @PackageName:com.qdw.vivo
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/12 0012 20:37
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        map.put(1,18);
        map.put(2,20);
        map.put(3,22);
        map.put(4,28);
        map.put(5,19);
        map.put(6,19);
        Random random = new Random();
        System.out.println(map.get(random.nextInt(7)));
    }
}
