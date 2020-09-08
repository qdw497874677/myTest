package com.qdw.lianxi;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test13
 * @Description:
 * @date: 2020/8/27 0027 22:34
 */
public class Test13 {
    public static void main(String[] args) {
        int method = method(14);
        System.out.println(method);
    }
    public static int method(int n){
        if(n==0){
            return 2;
        }
        int[] arr = new int[]{2,3,5};
        StringBuilder sb = new StringBuilder();
        n = n-1;
        // 类似进位，将十进制转换为三进制，三个数分别为2、3、5（相当于二进制中的0、1、2）
        while(n>=0){
            // 将取余的3个数转换为对应的三进制数
            sb.append(arr[(n)%3]);
            n = n/3-1;
        }
        return Integer.parseInt(sb.reverse().toString());
    }
}
