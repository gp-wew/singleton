package com.gupao.vip.gp16857.singleton.lazy;

/**
 * Created by 伟 on 2019/3/21.
 */
public class ThreadService implements Runnable{
    @Override
    public void run() {
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
    }
}
