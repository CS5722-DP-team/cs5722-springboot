package org.ul.dpproj.entity.command;

import org.ul.dpproj.entity.abstractFactory.MealSetOneFactory;
import org.ul.dpproj.entity.abstractFactory.MealSetThreeFactory;
import org.ul.dpproj.entity.abstractFactory.MealSetTwoFactory;
import org.ul.dpproj.entity.abstractFactory.SnackFactory;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command {

    private SnackFactory factory;
    private Order order;

    public void setFactory(SnackFactory factory) {
        this.factory = factory;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderCommand(SnackFactory factory, Order order) {
        this.factory = factory;
        this.order = order;
    }

    @Override
    public void execute() {
        Map<Integer, Integer> foodOrders = order.getFoodOrder();
        Set<Integer> setTypes = foodOrders.keySet();
        for(Integer setType: setTypes){
            if(foodOrders.get(setType)>0) {
                for(int i = 0;i < foodOrders.get(setType);i++) {
                    if (setType == 1) {
                        setFactory(new MealSetOneFactory());
                    } else if (setType == 2) {
                        setFactory(new MealSetTwoFactory());
                    } else if (setType == 3) {
                        setFactory(new MealSetThreeFactory());
                    }
                    factory.createStaple();
                    factory.createDrink();
                }

            }
        }
    }


}
