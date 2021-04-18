package org.ul.dpproj.entity.command;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<Integer,Integer> foodOrder = new HashMap<>();

    public Map<Integer, Integer> getFoodOrder() {
        return foodOrder;
    }

    public void setFoodOrder(Integer type,int num) {
        foodOrder.put(type,num);
    }
}
