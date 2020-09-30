package com.qdw.jinshanyun;

import java.util.Scanner;

/**
 * @PackageName:com.qdw.jinshanyun
 * @ClassName: Test2
 * @Description:
 * @date: 2020/9/23 0023 21:49
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 5;
        int count = 0;
        while (n/i!=0){
            long h = n/(10*i);
            long c = (n/i)*10;
            long l = n-(n/i)*i;
            if (c==0){
                count += h*i+(l+1);
            }else if(c==5){
                count+=h*i+(l+1);
            }else {
                count+=(h+1)*i;
            }
            i = i*10;
        }
        System.out.println(count);
    }

}
