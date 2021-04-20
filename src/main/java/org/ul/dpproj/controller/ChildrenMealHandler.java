package org.ul.dpproj.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ul.dpproj.entity.bridge.*;
import org.ul.dpproj.entity.builder.*;
import org.ul.dpproj.repository.bridge.CoffeeCapacityRepository;
import org.ul.dpproj.repository.bridge.CoffeeMilkAdditiveRepository;
import org.ul.dpproj.repository.builder.ChildrenMealDrinkRepository;
import org.ul.dpproj.repository.builder.ChildrenMealFoodRepository;
import org.ul.dpproj.repository.builder.ChildrenMealToyRepository;
import org.ul.dpproj.repository.builder.ChildrenMealVegetableRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/childrenMeal")
public class ChildrenMealHandler {
    @Autowired
    private ChildrenMealToyRepository childrenMealToyRepository;
    @Autowired
    private ChildrenMealFoodRepository childrenMealFoodRepository;
    @Autowired
    private ChildrenMealDrinkRepository childrenMealDrinkRepository;
    @Autowired
    private ChildrenMealVegetableRepository childrenMealVegetableRepository;

    List<JSONObject> list = new ArrayList<>();

    @GetMapping("/findAllParts")
    public  JSONObject findAllParts(){
        JSONObject resp = new JSONObject();
        resp.put("toy",childrenMealToyRepository.findAll());
        resp.put("food",childrenMealFoodRepository.findAll());
        resp.put("drink",childrenMealDrinkRepository.findAll());
        resp.put("vegetable",childrenMealVegetableRepository.findAll());
        return resp;
    }

    @PostMapping("/addChildrenMeal")
    public List<JSONObject> addPart(@RequestBody JSONObject json) {

        ChildrenMealBuilder builder;

        String toy = json.getString("toy");
        String food = json.getString("food");
        String drink = json.getString("drink");
        String vegetable = json.getString("vegetable");

        if (toy.equals("Car")) {
            builder = new ChildrenMealBuilderWithCar();
        } else {
            builder = new ChildrenMealBuilderWithPlane();
        }
        ChildrenMealDirector director = new ChildrenMealDirector(builder);
        ChildrenMeal meal =director.construct(food,drink,vegetable);

        JSONObject resp = new JSONObject();
        resp.put("toy",meal.getToy());
        resp.put("food",meal.getFood());
        resp.put("drink",meal.getDrink());
        resp.put("vegetable",meal.getVegetable());
        list.add(resp);
        return list;

    }

}
