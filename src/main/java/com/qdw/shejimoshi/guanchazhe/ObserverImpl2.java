package com.qdw.shejimoshi.guanchazhe;

/**
 * @Author: xiaomi
 * @Description: TODO
 * @date: 2020/7/18 下午3:11
 */
public class ObserverImpl2 extends Observer {

    public void update(Subject subject) {
        String data = (String)subject.getData();
        System.out.println("我是2，我收到了更新:"+data);
    }
}
