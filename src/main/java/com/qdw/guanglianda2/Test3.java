package com.qdw.guanglianda2;

import java.util.*;

/**
 * @PackageName:com.qdw.guanglianda2
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/9 0009 18:37
 *
 * 我们希望一个序列中的元素是各不相同的，但是理想和现实往往是有差距的。现在给出一个序列A，其中难免有些相同的元素，现在提供了一种变化方式，使得经过若干次操作后一定可以得到一个元素各不相同的序列。
 * 这个操作是这样的，令x为序列中最小的有重复的数字，你需要删除序列左数第一个x，并把第二个x替换为2*x。
 * 请你输出最终的序列。
 * 例如原序列是[2,2,1,1,1],一次变换后变为[2,2,2,1]，两次变换后变为[4,2,1]，变换结束
 * 输入描述
 * 输入第一行包含一个正整数n，表示序列的长度为n。(1<=n<=50000)
 * 第二行有n个整数，初始序列中的元素。(1<=a_i<=10^8)
 * 输出描述
 * 输出包含若干个整数，即最终变换之后的结果。
 * 样例输入
 * 5
 * 5 5 5 5 4
 * 样例输出
 * 20 4
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (String s1 : s) {
            int i = Integer.parseInt(s1);
            while (map.containsKey(i)){
                map.remove(i);
                i *= 2;
            }
            map.put(i,i);
        }
        for (Integer integer : map.keySet()) {
            System.out.print(integer+" ");
        }
    }
}
