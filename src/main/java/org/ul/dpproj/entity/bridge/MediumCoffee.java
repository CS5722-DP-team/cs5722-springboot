package org.ul.dpproj.entity.bridge;

import com.alibaba.fastjson.JSONObject;

public class MediumCoffee extends Coffee{
    public MediumCoffee(ICoffeeAdditives additives) {
        super(additives);
    }
    @Override
    public JSONObject order() {
        JSONObject json = new JSONObject();
        json.put("capacity","Medium Coffee");
        json.put("additive",additives.addAdditive());
        return json;
    }
}
