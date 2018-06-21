package com.test.from;

import java.util.Random;

public class AA extends A{

    @Override
    public String getUuid() {
        String uuid = super.getUuid();
        return uuid + "_" + (new Random().nextInt(10000) + 1);
    }

    
}
