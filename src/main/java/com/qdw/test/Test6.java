package com.qdw.test;

/**
 * @Author: xiaomi
 * @Description: TODO
 * @date: 2020/7/18 下午7:51
 */
public class Test6 {
    public static void main(String[] args) {
        int[][] g = {{1,1,0},{0,1,0},{0,1,1}};
        int i = 0;
        int j = 1;
        for (int k = 0; k < g.length; k++) {
            for (int l = 0; l < g[0].length; l++) {
                System.out.print(g[k][l]+" ");
            }
            System.out.println();
        }
        Test6 test6 = new Test6();
        test6.solution(g,i,j);
    }

    public void solution(int[][] g,int i,int j){
        int target = g[i][j];
        System.out.println(target);
        int[][] vi = new int[g.length][g[0].length];
        dfs(g,i,j,target,vi);
    }

    public boolean dfs(int[][] g,int i,int j,int target,int[][] vi){
        System.out.println("!!"+i+" "+j);
        if (i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]!=target){

            return false;
        }
        if (vi[i][j]==1){
            return true;
        }

        vi[i][j] = 1;
        boolean notEdge = true;
//        int[] dx = {1,-1,0,0};
//        int[] dy = {0,0,1,-1};
//        System.out.println();
//        for (int k = 0; k < 4; k++) {
//            System.out.println("i+dx[k]:"+(i+dx[k])+"j+dy[k]:"+(j+dy[k]));
//            notEdge = notEdge && dfs(g,i+dx[k],j+dy[k],target);
//        }
        notEdge = notEdge && dfs(g,i,j-1,target,vi);
        notEdge = notEdge && dfs(g,i,j+1,target,vi);
        System.out.println("+++"+(i+1)+"  "+j);
        notEdge = notEdge && dfs(g,i+1,j,target,vi);
        notEdge = notEdge && dfs(g,i-1,j,target,vi);

        if (!notEdge){
            System.out.println("("+i+","+j+")");
        }

        return true;
    }
}
