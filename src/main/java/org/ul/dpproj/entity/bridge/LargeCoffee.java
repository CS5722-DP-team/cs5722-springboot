package org.ul.dpproj.entity.bridge;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class LargeCoffee extends Coffee{
    public LargeCoffee(ICoffeeAdditives additives) {
        super(additives);
    }

    @Override
    public JSONObject order() {
        JSONObject json = new JSONObject();
        json.put("capacity","Large Coffee");
        json.put("additive",additives.addAdditive());
        return json;
    }
}
