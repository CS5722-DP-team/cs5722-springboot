package org.ul.dpproj.entity.bridge;

import com.alibaba.fastjson.JSONObject;

public class SmallCoffee extends Coffee{
    public SmallCoffee(ICoffeeAdditives additives) {
        super(additives);
    }
    @Override
    public JSONObject order() {
        JSONObject json = new JSONObject();
        json.put("capacity","Small Coffee");
        json.put("additive",additives.addAdditive());
        return json;
    }
}
