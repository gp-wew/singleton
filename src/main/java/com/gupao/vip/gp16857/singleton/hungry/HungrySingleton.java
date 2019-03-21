package com.gupao.vip.gp16857.singleton.hungry;

/**
 * Created by 伟 on 2019/3/21.
 */
public class HungrySingleton {
    private static final HungrySingleton hs = new HungrySingleton();

    public HungrySingleton() {
    }

    public HungrySingleton getInstence(){
        return  hs;
    }
}
