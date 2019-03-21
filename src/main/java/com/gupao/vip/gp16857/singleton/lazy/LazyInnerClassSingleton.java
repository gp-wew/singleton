package com.gupao.vip.gp16857.singleton.lazy;

/**
 * Created by 伟 on 2019/3/21.
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        if (LazyHodler.lis != null) {
            throw new RuntimeException("");
        }
    }

    public static final LazyInnerClassSingleton getInstence() {
        return LazyHodler.lis;
    }

    private static class LazyHodler {
        private static final LazyInnerClassSingleton lis = new LazyInnerClassSingleton();
    }
}
