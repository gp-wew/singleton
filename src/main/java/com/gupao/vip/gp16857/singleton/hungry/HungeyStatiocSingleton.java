package com.gupao.vip.gp16857.singleton.hungry;

/**
 * Created by 伟 on 2019/3/21.
 */
public class HungeyStatiocSingleton {
    private static final HungeyStatiocSingleton hss;

    static {
        hss = new HungeyStatiocSingleton();
    }

    private HungeyStatiocSingleton() {
    }

    public HungeyStatiocSingleton getInstence(){
        return hss;
    }
}
