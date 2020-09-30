package com.qdw.guangfa;

import java.util.Arrays;

/**
 * @PackageName:com.qdw.guangfa
 * @ClassName: Test1
 * @Description:
 * @date: 2020/9/24 0024 15:50
 */
public class Test1 {
    public static void main(String[] args) {
        String versions = "3.1 2.2 1.0 6.4 4.5 5.2";
//        String versions = "2.x 3.1.x 3.0 3 4.x.y";
        System.out.println("31".split(".").length);
        System.out.println(sortVersion(versions));
    }

    public static String sortVersion (String versions) {
        // write code here
        // 版本号 这样写 对不 有啥问题
        String[] s = versions.split(" ");
        Arrays.sort(s,(a,b)->{
            String[] split = a.split("\\.");
            String[] split1 = b.split("\\.");
            if (split.length==0||split1.length==0){
                return b.compareTo(a);
            }
            int i = 0;
            while (i<split.length&&i<split1.length){
                if (!split[i].equals(split1[i])){
                    return split1[i].compareTo(split[i]);
                }
                i++;
            }
            return split1.length-split.length;
        });
        return "["+String.join(",",s)+"]";
    }
}
