package org.ul.dpproj.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ul.dpproj.entity.abstractFactory.*;
import org.ul.dpproj.entity.command.Order;
import org.ul.dpproj.entity.command.OrderCommand;
import org.ul.dpproj.entity.command.Waitor;

@RestController
@RequestMapping("/mealset")
public class MealSetController {

    @GetMapping("/findallmealsets")
    public JSONObject findAllMealSets(){
        JSONObject resp = new JSONObject();
        //resp.put("staple",stapleRepository.findAll());

        return resp;
    }

    @GetMapping("/getmealset/{num}")
    public JSONObject getMealSet(@PathVariable("num") String num){
        Staple staple;
        Drink drink;
        Double price;
        JSONObject resp = new JSONObject();
        switch (num){
            case "1":
                staple = new MealSetOneFactory().createStaple();
                drink = new MealSetOneFactory().createDrink();
                price = new MealSetOneFactory().getPrice();
                resp.put("staple", staple);
                resp.put("drink",drink);
                resp.put("price",price);
                return resp;
            case "2":
                staple = new MealSetTwoFactory().createStaple();
                drink = new MealSetTwoFactory().createDrink();
                price = new MealSetTwoFactory().getPrice();
                resp.put("staple", staple);
                resp.put("drink",drink);
                resp.put("price",price);
                return resp;
            case "3":
                staple = new MealSetThreeFactory().createStaple();
                drink = new MealSetThreeFactory().createDrink();
                price = new MealSetThreeFactory().getPrice();
                resp.put("staple", staple);
                resp.put("drink",drink);
                resp.put("price",price);
                return resp;
            default:
                staple = null;
                drink = null;
                price = 0.0;
                return null;
        }
        /*Staple staple = new MealSetTwoFactory().createStaple();
        Drink drink = new MealSetTwoFactory().createDrink();*/
        /*JSONObject resp = new JSONObject();
        resp.put("staple", staple);
        resp.put("drink",drink);
        resp.put("price",price);
        return resp;*/
    }

    @GetMapping("/handlemealset/{type1}/{num1}/{type2}/{num2}/{type3}/{num3}")
    public String handleOrders(@PathVariable("type1")Integer type1,@PathVariable("num1")Integer num1,
                                   @PathVariable("type2")Integer type2,@PathVariable("num2")Integer num2,
                                   @PathVariable("type3")Integer type3,@PathVariable("num3")Integer num3){
        Order order = new Order();
        order.setFoodOrder(type1,num1);
        order.setFoodOrder(type2,num2);
        order.setFoodOrder(type3,num3);
        Waitor waitor = new Waitor();
        SnackFactory factory1 = new MealSetOneFactory();
        OrderCommand orderCommand1 = new OrderCommand(factory1,order);
        waitor.setCommand(orderCommand1);
        waitor.orderUp();

        return "success";
    }


}
