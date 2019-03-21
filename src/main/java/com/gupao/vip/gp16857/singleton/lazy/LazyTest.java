package com.gupao.vip.gp16857.singleton.lazy;

/**
 * Created by 伟 on 2019/3/21.
 */
public class LazyTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadService());
        Thread t2 = new Thread(new ThreadService());

        t1.start();
        t2.start();
    }
}
