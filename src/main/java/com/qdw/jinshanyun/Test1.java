package com.qdw.jinshanyun;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.jinshanyun
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/23 0023 22:06
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String[] s = sc.nextLine().split(" ");
            int[] arr = new int[s.length+1];
            for (int i = 0; i < s.length; i++) {
                arr[i+1] = Integer.parseInt(s[i]);
            }
            boolean flag = false;
            for (int i = 1; i < arr.length; i++) {
                int i1 = get(arr, i * 2);
                int i2 = get(arr,i*2+1);
//                System.out.println(i1+" "+i2);
                if (i1==i2&&i1!=0){
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
    public static int get(int[] arr,int i){
        if (i>=arr.length){
            return 0;
        }
        return arr[i]+get(arr,i*2)+get(arr,i*2+1);
    }
}
