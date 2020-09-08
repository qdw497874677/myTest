package com.qdw.lianxi;

import java.util.*;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test2
 * @Description:
 * @date: 2020/8/12 0012 23:31
 */
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new PriorityQueue<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(!set.contains(a)){
                queue.add(a);
                set.add(a);
            }
        }
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
