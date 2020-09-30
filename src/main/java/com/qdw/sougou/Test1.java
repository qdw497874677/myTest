package com.qdw.sougou;

import sun.applet.Main;

/**
 * @PackageName:com.qdw.sougou
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/25 0025 19:03
 */
class Interval {
    int start;
    int end;
    public Interval(){

    }
    public Interval(int a,int b){
        start = a;
        end = b;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
//        Interval solve = test1.solve(3, 3, "ABC", "ABC");
//        Interval solve = test1.solve(3, 1, "ABC", "ABC");
        Interval solve = test1.solve(3, 2, "AAD", "ABC");
//        Interval solve = test1.solve(3, 1, "ABC", "DDD");
        System.out.println(solve);
    }

    public Interval solve (int n, int k, String str1, String str2) {
        // write code here
        Interval interval = new Interval();
        int same = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)==str2.charAt(i)){
                same++;
            }
        }
        if (same==n){
            interval.end = k;
            interval.start = k;
        }else if (n==k){
            interval.end = same;
            interval.start = same;
        }else if (k>same){
//            interval.end = same+ Math.min((n - k),(n-same));
            interval.end = same+ (n - k);
//            interval.start = Math.min(n-k,same);
            interval.start = same;
        }else{
            interval.end = k+n-same;
            interval.start = k;
        }
        return interval;

    }
}
