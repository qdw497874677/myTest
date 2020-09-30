package com.qdw.sougou;

/**
 * @PackageName:com.qdw.sougou
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/25 0025 19:22
 */
public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        String[] s1 = {"1101","1010","1111","1110"};
        String[] s2 = {"ABCD","EFGH","IJKL","MNPQ"};
        System.out.println(test2.rotatePassword(s1, s2));
    }
    public String rotatePassword (String[] s1, String[] s2) {
        // write code here
        int n1 = s1.length;
        int m1 = s1[0].length();
        int n2 = s2.length;
        int m2 = s2[0].length();
        int[][] g1 = new int[n1][m1];
        char[][] g2 = new char[n2][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                g1[i][j] = s1[i].charAt(j)-'0';
                g2[i][j] = s2[i].charAt(j);
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            if (i!=0){
                helper(g1);
            }
            for (int j = 0; j < n1; j++) {
                for (int k = 0; k < m1; k++) {
                    if (g1[j][k]==0){
                        res.append(g2[j][k]);
                    }
                }
                System.out.println();
            }
        }
        return res.toString();
    }
    public void helper(int[][] g){
        int n = g.length;
        int m = g[0].length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1-i; j++) {
                int temp = g[i][j];
                g[i][j] = g[m-j-1][n-i-1];
                g[m-j-1][n-i-1] = temp;
            }
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m; j++) {
                int temp = g[i][j];
                g[i][j] = g[n-1-i][j];
                g[n-1-i][j] = temp;
            }
        }

    }
}
