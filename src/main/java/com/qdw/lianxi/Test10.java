package com.qdw.lianxi;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test10
 * @Description:
 * @date: 2020/8/16 0016 17:32
 */
public class Test10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[] arr = new int[n];
            s = sc.nextLine().split(" ");
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(s[i]);
            }
            for (int i = 0; i < m; i++) {
                String s1 = sc.nextLine();
                if (s1.isEmpty()){
                    continue;
                }
                s = s1.split(" ");
                if("Q".equals(s[0])){
                    System.out.println(getMax(Integer.parseInt(s[1])-1,Integer.parseInt(s[2])-1,arr));
                }else{
                    arr[Integer.parseInt(s[1])-1] = Integer.parseInt(s[2]);
                }
            }
        }


    }
    static public int getMax(int i,int j,int[] arr){
        int res = Integer.MIN_VALUE;
        if (i>j){
            int temp = i;
            i = j;
            j = temp;
        }
        for(int k=i;k<=j;k++){
            res = Math.max(arr[k],res);
        }
        return res;
    }
}
