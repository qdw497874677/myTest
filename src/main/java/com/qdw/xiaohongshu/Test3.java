package com.qdw.xiaohongshu;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @PackageName:com.qdw.xiaohongshu
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/12 0012 10:26
 */
public class Test3 {
    static List<int[]> boxs;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[][] arr = new int[n][3];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                arr[i][2] = sc.nextInt();
            }
            boxs = new ArrayList<>();
            Random random = new Random();
            random.nextInt();
        }
    }

    public static void dfs(int[][] arr,int sum){

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);

        }
    }

    public static boolean can(int[] box1,int[] box2){
        if (boxs.contains(box2)){
            return false;
        }
        if (box1[0]>=box2[0] && box1[1]>=box2[1]){
            boxs.add(box2);
            return true;
        }
        return false;
    }
}
