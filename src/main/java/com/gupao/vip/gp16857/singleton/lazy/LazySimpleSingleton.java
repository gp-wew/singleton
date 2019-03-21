package com.gupao.vip.gp16857.singleton.lazy;

/**
 * Created by 伟 on 2019/3/21.
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }
    private static LazySimpleSingleton lss = null;
    public synchronized static LazySimpleSingleton getInstance(){
        if (lss==null){
            lss = new LazySimpleSingleton();
        }
        return lss;
    }
}
