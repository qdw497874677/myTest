package com.qdw.aiqiyi;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.aiqiyi
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/13 0013 15:20
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int count = 1;
        String card = s[0];
        for (int i = 1; i < s.length; i++) {
            if (count==0){
                card = s[i];
            }
            if (card.equals(s[i])){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(card);
    }
}
