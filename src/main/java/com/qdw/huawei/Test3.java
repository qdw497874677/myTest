package com.qdw.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.huawei
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/6 0006 18:43
 */
public class Test3 {
    static class Node{
        double pD;
        double pR;
        double pS;

        @Override
        public String toString() {
            return pD+" "+pR+" "+pS;
        }
    }
    static List<Double> list;
    //2 2
    //1.0 0.0 0.0 0.5 0.0 0.5
    //0.0 0.5 0.5 0.5 0.5 0.0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Node[][] arr = new Node[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Node node = new Node();
                node.pD = sc.nextDouble();
                node.pR = sc.nextDouble();
                node.pS = sc.nextDouble();
                arr[i][j] = node;
            }
        }
//        for (Node[] node : arr) {
//            for (Node node1 : node) {
//                System.out.println(node1);
//            }
//        }
        method(arr);
    }
    public static void method(Node[][] arr){
        list = new ArrayList<>();
        dfs(arr,0,0,1,1,0,true);
//        for (Double aDouble : list) {
//            System.out.println(aDouble);
//        }
        double res = 0;
        for (Double aDouble : list) {
            res += aDouble;
        }
        System.out.println(res);
    }
    public static void dfs(Node[][] arr,int i,int j,double ji,int step,double sum,boolean flag){
        if(i>=arr.length||j>=arr[0].length){
            return;
        }
        if (i==arr.length-1&&j==arr[0].length-1){
            list.add(ji*step);
//            list.add(sum);
//            list.add(sum*step);
            System.out.println(ji*step);
            return;
        }

//        dfs(arr,i+1,j,ji*(arr[i][j].pD+arr[i][j].pS),step+1,sum+ji*arr[i][j].pD);
//        dfs(arr,i,j+1,ji*(arr[i][j].pR+arr[i][j].pS),step+1,sum+ji*arr[i][j].pR);

        dfs(arr,i+1,j,ji*arr[i][j].pD,step+1,sum+arr[i][j].pD,true);
        dfs(arr,i,j+1,ji*arr[i][j].pR,step+1,sum+arr[i][j].pR,true);
        if (flag){
            dfs(arr,i,j,ji,step,sum+arr[i][j].pS,false);
        }

//        if (arr[i][j].pS!=0.0){
//            double s = arr[i][j].pS;
//            arr[i][j].pS = 0;
//            dfs(arr,i,j,ji*s,step+1,sum+s);
//        }

    }
}
