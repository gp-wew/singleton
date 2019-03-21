package com.gupao.vip.gp16857.singleton.lazy;

/**
 * Created by 伟 on 2019/3/21.
 */
public class LazyDoubleCheckSingleton {
    private LazyDoubleCheckSingleton() {
    }
    private volatile static LazyDoubleCheckSingleton ldcs;

    public static LazyDoubleCheckSingleton getInstance(){
        if (ldcs==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (ldcs==null){
                    ldcs = new LazyDoubleCheckSingleton();
                }
            }
        }
        return ldcs;
    }
}
