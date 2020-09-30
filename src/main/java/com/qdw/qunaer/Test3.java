package com.qdw.qunaer;

import java.util.*;

/**
 * @PackageName:com.qdw.qunaer
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/23 0023 20:16
 */
public class Test3 {
    static Map<String,Integer> map = new HashMap<>();
    static {
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        map.put("4",4);
        map.put("5",5);
        map.put("6",6);
        map.put("7",7);
        map.put("8",8);
        map.put("9",9);
        map.put("10",10);
        map.put("J",11);
        map.put("Q",12);
        map.put("K",13);
        map.put("A",14);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        String s1 = checkTongHua(s);
//        System.out.println(checkHuase(s));
//        System.out.println(checkShun(s));
        if (s1!=null){
            System.out.println(s1);
            return;
        }
        String s2 = checkShuliang(s);
        System.out.println(s2);
    }


    public static char checkHuase(String[] s){
        for (int i = 1; i < s.length; i++) {
            if (s[i].charAt(0)!=s[i-1].charAt(0)){
                return ' ';
            }
        }
        return s[0].charAt(0);
    }
    public static int checkShun(String[] s){
        for (int i = 1; i < s.length; i++) {
            if (map.get(s[i-1].substring(1))-1!=map.get(s[i].substring(1))){
                return -1;
            }
        }
        return map.get(s[0].substring(1));
    }
    public static String checkTongHua(String[] s){
        int a = checkShun(s);
        if (a!=-1){
            if (checkHuase(s)!=' '){
                if (a==14){
                    return "HuangJiaTongHuaShun";
                }else {
                    return "TongHuaShun";
                }
            }
        }
        return null;
    }
    public static String checkShuliang(String[] s){
        int[] arr = new int[15];
        int res = 0;
        for (int i = 0; i < s.length; i++) {
            arr[map.get(s[i].substring(1))-1]++;

        }
        Queue<Integer> heap = new PriorityQueue<>((a,b)->{
            return b-a;
        });
        for (int i : arr) {
            heap.add(i);
        }
        if (heap.peek()==4){
            return "SiTiao";
        }else if (heap.peek()==3&&heap.poll()==3){
            if (heap.peek()==2){
                return "HuLu";
            }else if (checkHuase(s)!=' '){
                return "TongHua";
            }else if (checkShun(s)!=-1){
                return "ShunZi";
            }else {
                return "SanTiao";
            }
        }else if (heap.peek()==2&&heap.poll()==2){
            if (checkHuase(s)!=' '){
                return "TongHua";
            }else if (heap.peek()==2){
                return "LiangDui";
            }else {
                return "YiDui";
            }

        }else {
            return "GaoPai";
        }

    }
}
