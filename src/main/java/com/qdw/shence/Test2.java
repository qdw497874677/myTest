package com.qdw.shence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @PackageName:com.qdw.shence
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/21 0021 16:41
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        String[] ss = s.split(" ");
        for (int k=0;k<ss.length;k++){
            StringBuilder temp = new StringBuilder();
//            if (k==ss.length-1){
//                temp.append(ss[k]).reverse();
//                sb.append(temp);
//            }else {
//                temp.append(ss[k]).reverse();
//            }
            temp.append(ss[k]).reverse();
            if (temp.length()==0){
                continue;
            }
            sb.append(temp).append(" ");
        }
        System.out.println(sb);
    }
}
