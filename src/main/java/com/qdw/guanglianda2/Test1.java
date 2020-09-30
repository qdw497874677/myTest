package com.qdw.guanglianda2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.guanglianda2
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/9 0009 17:59
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        Queue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            heap.add(sc.nextInt());
        }
        while (m>0){
            m--;
            int low = heap.peek();
            heap.remove(low);
            heap.add(low+x);
        }
        System.out.println(heap.peek());
    }
}
