package org.ul.dpproj.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ul.dpproj.entity.abstractFactory.*;

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
        System.out.println("访问到了");
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
}
