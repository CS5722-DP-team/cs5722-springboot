package org.ul.dpproj.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ul.dpproj.entity.abstractFactory.Drink;
import org.ul.dpproj.entity.abstractFactory.MealSetOneFactory;
import org.ul.dpproj.entity.abstractFactory.MealSetTwoFactory;
import org.ul.dpproj.entity.abstractFactory.Staple;

@RestController
@RequestMapping("/mealset")
public class MealSetController {

    @GetMapping("/findallmealsets")
    public JSONObject findAllMealSets(){
        JSONObject resp = new JSONObject();
        //resp.put("staple",stapleRepository.findAll());

        return resp;
    }

    @GetMapping("/getmealset")
    public JSONObject getMealSet(){
        Staple staple = new MealSetTwoFactory().createStaple();
        Drink drink = new MealSetTwoFactory().createDrink();
        JSONObject resp = new JSONObject();
        resp.put("staple", staple);
        resp.put("drink",drink);
        resp.put("price",new MealSetTwoFactory().getPrice());
        return resp;
    }
}
