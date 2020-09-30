package com.qdw.vipkid;

import java.util.*;

/**
 * @PackageName:com.qdw.vipkid
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/24 0024 19:33
 */
public class Test2 {
    static Map<Character,Integer> map = new HashMap<>();
    static {
        map.put('零',0);
        map.put('一',1);
        map.put('二',2);
        map.put('三',3);
        map.put('四',4);
        map.put('五',5);
        map.put('六',6);
        map.put('七',7);
        map.put('八',8);
        map.put('九',9);
        map.put('十',10);
        map.put('百',100);
        map.put('千',1000);
        map.put('万',10000);
        map.put('亿',100000000);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        long res = 0;
        String regex = "[一二三四五六七八九零]";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).matches(regex)){
                if (chars[i]=='零'){
                    if (i+2<chars.length&&map.get(chars[i-1])!=10*map.get(chars[i+2])){
                        if (map.get(chars[i-1])==1000){
                            list.add(0);
                        }else if(map.get(chars[i-1])==10000){
                            list.add(0);list.add(0);
                        }

                    }
                }
                list.add(map.get(chars[i]));
            }
        }
        for (Integer integer : list) {
            System.out.print(integer);
        }
//        Deque<Character> stack = new LinkedList<>();
//        res = map.get(chars[0]);
//        for (int i = 0; i < chars.length; i++) {
//            if (!stack.isEmpty()&&map.get(stack.peek())<10&&map.get(chars[i])>=10){
//
//            }
//            Integer integer = map.get(chars[i]);
//            if (integer>=10){
//                res *= integer;
//            }else {
//                res += integer;
//            }
//        }
    }
}
