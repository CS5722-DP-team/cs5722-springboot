package org.ul.dpproj.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ul.dpproj.entity.adapter.*;
import org.ul.dpproj.entity.builder.*;
import org.ul.dpproj.repository.adapter.ChangeRoomToKitchenRepository;
import org.ul.dpproj.repository.builder.ChildrenMealDrinkRepository;
import org.ul.dpproj.repository.builder.ChildrenMealFoodRepository;
import org.ul.dpproj.repository.builder.ChildrenMealToyRepository;
import org.ul.dpproj.repository.builder.ChildrenMealVegetableRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/changeRoomToKitchen")
public class ChangeRoomToKitchenHandler {
    @Autowired
    private ChangeRoomToKitchenRepository changeRoomToKitchenRepository;


    List<JSONObject> list = new ArrayList<>();

    @GetMapping("/findAllParts")
    public  JSONObject findAllParts(){
        JSONObject resp = new JSONObject();
        resp.put("room",changeRoomToKitchenRepository.findAll());
        return resp;
    }



    @PostMapping("/changeRoom")
    public List<JSONObject> changeRoom(@RequestBody JSONObject json) {
        RoomType room;
        String r = json.getString("room");
        if(r.equals("Balcony")){
            room = new Balcony();
        }else if(r.equals("Bathroom")){
            room = new Bathroom();
        }else if(r.equals("Laundry")){
            room = new Laundry();
        }else {
            room = new Lounge();
        }
        Adapter adapter = new Adapter(room);
        String s = adapter.isKitchen();
        JSONObject resp = new JSONObject();
        resp.put("description",s);
        list.add(resp);
        return list;
    }

}
