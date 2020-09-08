package com.qdw.lianxi;

import java.util.*;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test14
 * @Description:
 * @date: 2020/8/29 0029 10:51
 */
public class Test14 {
    public static void main(String[] args) {
        String[] cards = new String[]{"p3","h10","h4","k1"};
        for (String s : m(cards)) {
            System.out.print(s+" ");
        }
    }
    public static String[] m(String[] cards){
        int[] arr = new int[256];
        arr['k'] = 1;
        arr['s'] = 2;
        arr['h'] = 3;
        arr['p'] = 4;
        arr['q'] = 5;
        Arrays.sort(cards,(a,b)->{
            if(arr[a.charAt(0)]!=arr[b.charAt(0)]){
                return arr[a.charAt(0)]-arr[b.charAt(0)];
            }else{
                return Integer.parseInt(a.substring(1,a.length()))-Integer.parseInt(b.substring(1,b.length()));
            }
        });

        return cards;
    }
}
