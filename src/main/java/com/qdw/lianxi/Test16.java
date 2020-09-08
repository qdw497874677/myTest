package com.qdw.lianxi;

import java.util.TreeMap;

/**
 * @PackageName:com.qdw.lianxi
 * @ClassName: Test16
 * @Description:
 * @date: 2020/9/6 0006 22:39
 */
public class Test16 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,6,6,6,8,8,9};
        System.out.println(method(arr,8));
    }
    public static int method(int[] arr,int target){
        return search(arr,target,false)-search(arr,target,true)+1;
    }
    public static int search(int[] arr,int target,boolean flag){
        int left = 0;
        int right = arr.length-1;
        int res = -1;
        while(left<=right){
            int mid = (right-left)/2 + left;
            if(arr[mid]<target){
                left = mid+1;
            }else if (arr[mid]>target){
                right = mid-1;
            }else {
                res = mid;
                // 找到目标之后根据flag把右或者左指针再次移动一个，来找到最左或者最右边的目标索引
                if (flag){
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }
        }
        return res;
    }
}
