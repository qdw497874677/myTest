package com.qdw.wangyi2;

import java.util.*;

/**
 * @PackageName:com.qdw.wangyi2
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/13 0013 10:58
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<String,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        set.add("0");
        set.add("1");
        set.add("10");
        set.add("11");
        set.add("100");
        set.add("101");
        set.add("110");
        set.add("111");
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        for (int i = 1; i < s.length() + 1; i++) {
            String one = s.substring(i-1,i);
            if(set.contains(one)){
                dp[i] += dp[i-1];
//                System.out.println("one "+one);
            }
            if(i>=2){
                String two = s.substring(i-2,i);
                if(set.contains(two)){
                    dp[i] += dp[i-2];
//                    System.out.println("two "+two);
                }
            }
            if(i>=3){
                String three = s.substring(i-3,i);
                if(set.contains(three)){
                    dp[i] += dp[i-3];
                }
            }
        }
        System.out.println(dp[s.length()]);
    }
}
