package com.qdw.lianxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test9
 * @Description:
 * @date: 2020/8/15 0015 19:41
 */
public class Test9 {
    public static void main(String[] args) {
        Test9 test9 = new Test9();
//        int[] arr = new int[]{1,1,2,2,2};
//        int[] arr = new int[]{3,3,3,3,4};
        int[] arr = new int[]{6035753,3826635,922363,6104805,1189018,6365253,364948,2725801,5577769,7857734,2860709,9554210,4883540,8712121,3545089};
        System.out.println(test9.makesquare(arr));
    }

    int[] sums = new int[4];
    List<Integer> list;
    int sum;
    public boolean makesquare(int[] nums) {
        if (nums==null || nums.length<4){
            return false;
        }
        sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum%4!=0){
            return false;
        }
        // 把类型数组转化为list并排序
        list = Arrays.stream(nums).boxed().sorted((a, b) -> {
            return b - a;
        }).collect(Collectors.toList());
        int s = sum/4;
        for (Integer integer : list) {
            if (integer>s){
                return false;
            }
        }
        return dfs(0);
    }
    public boolean dfs(int index){
        if (index == list.size()){
            // 四个边相等就成功
            if (sums[0]==sums[1] && sums[1]==sums[2] && sums[2]==sums[3]){
                return true;
            }else {
                return false;
            }
        }
        int e = list.get(index);
        // 放四个边里放
        for (int i = 0; i < 4; i++) {
            // 边不能大于总长的四分之一
            if (sums[i]+e<=sum/4){
                sums[i] += e;
                if (dfs(index + 1)){
                    return true;
                }
                sums[i] -= e;
            }
        }
        return false;
    }
}
