package org.ul.dpproj.entity.bridge;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public abstract class Coffee {
    protected ICoffeeAdditives additives;
    public Coffee(ICoffeeAdditives additives){
        this.additives = additives;
    }
    public abstract JSONObject order();
}
