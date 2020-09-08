package com.qdw.lianxi;

import java.util.*;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test3
 * @Description:
 * @date: 2020/8/13 0013 21:46
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(n>1000){
                n=999;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i=0;
            while (list.size()>1){
                i = (i+2)%list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
