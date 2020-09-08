package com.qdw.lianxi;

import java.util.*;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test8
 * @Description:
 * @date: 2020/8/15 0015 9:57
 */
public class Test8 {
    int[] count;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");

//        int[] arr = new int[]{1,1,1,1,2,2,3,3,5,6,7,7,8};
        int[] arr = new int[13];
        for (int i = 0; i < 13; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        Test8 test8 = new Test8();
        List<Integer> method = test8.method(arr);
        for (Integer integer : method) {
            System.out.print(integer+" ");
        }
    }

    public List<Integer> method(int[] arr){
        List<Integer> res = new ArrayList<>();
        count = new int[9];
        for (int i : arr) {
            count[i-1]++;
        }
        for (int i = 0; i < 9; i++) {
            if (count[i]<4){
                count[i]++;
                if (win()){
                    res.add(i+1);
                }
                count[i]--;
            }
        }
        return res;
    }
    public boolean win(){
        for (int i = 0; i < 9; i++) {
            if (count[i]>=2){
                count[i] -= 2;
                boolean b = backTrack(4);
                count[i] += 2;
                if (b){
                    return b;
                }
            }
        }
        return false;
    }
    public boolean backTrack(int n){
        if(n==0){
            return true;
        }
        // 判断是否有顺子或者刻子
        for (int i = 0; i < 9; i++) {
            // 尝试刻子
            if (count[i]>=3){
                count[i] -= 3;
                boolean b = backTrack(n - 1);
                count[i] += 3;
                return b;
            }
            // 尝试顺子
            if (i<=6 && count[i]>0 && count[i+1]>0 && count[i+2]>0){
                count[i]--;
                count[i+1]--;
                count[i+2]--;
                boolean b = backTrack(n - 1);
                count[i]++;
                count[i+1]++;
                count[i+2]++;
                return b;
            }

        }
        return false;
    }
}
