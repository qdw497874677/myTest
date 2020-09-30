package com.qdw.guangfa;

/**
 * @PackageName:com.qdw.guangfa
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/24 0024 16:31
 */
public class Test2 {
    public static void main(String[] args) {
        String s = "asafgasffdcsdf";
        System.out.println(encode(s));
    }
    public static String encode (String srcStr) {
        // write code here
        int i = 0;
        int j = 0;
        StringBuilder res = new StringBuilder();
        do {
            i = j;
            j = i+3;
            if (j>srcStr.length()){
                j = srcStr.length();
            }
            String s = srcStr.substring(i,j);

            System.out.println(s);
        }while (j<srcStr.length());
        return "s";
    }
}
