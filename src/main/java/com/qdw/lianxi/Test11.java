package com.qdw.lianxi;

import java.util.*;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test10
 * @Description:
 * @date: 2020/8/16 0016 17:32
 */
public class Test11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String,Integer> map = new HashMap<>();
        Queue<String> heap = new PriorityQueue<>((a,b)->{
            return map.get(b)-map.get(a);
        });
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split("\\\\");
            String a = s[s.length-1];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        heap.addAll(map.keySet());
        while(!heap.isEmpty()){
            String poll = heap.poll();
            System.out.println(poll+" "+map.get(poll));
        }

    }

}
