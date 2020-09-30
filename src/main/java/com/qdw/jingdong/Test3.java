package com.qdw.jingdong;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @PackageName:com.qdw.jingdong
 * @ClassName: Test3
 * @Description:
 * @date: 2020/9/17 0017 21:04
 */
public class Test3 {
    public void getYears(String str) {
        str = "a" + str + "a";
        String pattern = "[^0-9]([1-3][0-9][0-9][0-9])[^0-9]";
        Pattern compile = Pattern.compile(pattern);
        Matcher m = compile.matcher(str);
        List<String> result = new LinkedList<>();

        while (m.find()) {
            result.add(m.group(1));
        }
        // [2019, 2020]
        // 你自己按格式打印一下就行
        System.out.println(result);
    }
    public static void main(String[] args) {
        Test3 solution = new Test3();
        solution.getYears("2019abc20198and1232116rhffh2018abc2020");
    }
}
