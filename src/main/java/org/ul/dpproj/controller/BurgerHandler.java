package org.ul.dpproj.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import org.ul.dpproj.entity.Book;
import org.ul.dpproj.entity.builder.*;
import org.ul.dpproj.entity.visitor.*;
import org.ul.dpproj.repository.builder.ChildrenMealDrinkRepository;
import org.ul.dpproj.repository.builder.ChildrenMealFoodRepository;
import org.ul.dpproj.repository.builder.ChildrenMealToyRepository;
import org.ul.dpproj.repository.builder.ChildrenMealVegetableRepository;
/*import org.ul.dpproj.repository.visitor.BurgerPartburgerRepository;*/
/*
import org.ul.dpproj.repository.visitor.BurgerPartChickenRepository;
import org.ul.dpproj.repository.visitor.BurgerPartSopRepository;
import org.ul.dpproj.repository.visitor.BurgerPartVegetableRepository;
*/


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/burgervisitor")
public class BurgerHandler {
/*
    @Autowired
    private BurgerPartChickenRepository burgerPartChickenRepository;
    @Autowired
    private BurgerPartSopRepository burgerPartSopRepository;
    @Autowired
    private BurgerPartVegetableRepository burgerPartVegetableRepository;*/

   /* List<JSONObject> list = new ArrayList<>();*/
    @PostMapping("/displayburger")
    public List<BurgerPart> BurgerPartDisplayVisitor() {



        List<BurgerPart> list = VisitorPatternDemo.getList();
        for(BurgerPart e: list){
            e.accept(new BurgerPartDisplayVisitor());}

        return list;


/*
        resp.put(list);
        JSONArray jsonArray = JSONArray.fromObject(orderNoArray);
        return jsonArray;
*/

    }


    }


