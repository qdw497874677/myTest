package com.qdw.shejimoshi.guanchazhe;

/**
 * @Author: xiaomi
 * @Description: TODO
 * @date: 2020/7/18 下午3:14
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Subject subject = new SubjectImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        subject.attach(observer1);
        subject.attach(observer2);

        for (int i = 0; i < 10; i++) {
            subject.execute();
            subject.notifyObs();
            Thread.sleep(1000);
        }
    }
}
