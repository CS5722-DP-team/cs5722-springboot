package org.ul.dpproj.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ul.dpproj.entity.bridge.*;
import org.ul.dpproj.entity.memento.FamilyLunchMemento;
import org.ul.dpproj.repository.bridge.CoffeeCapacityRepository;
import org.ul.dpproj.repository.bridge.CoffeeMilkAdditiveRepository;
import org.ul.dpproj.repository.memento.FamilyLunchSauceRepository;
import org.ul.dpproj.repository.memento.FamilyLunchStapleRepository;
import org.ul.dpproj.repository.memento.FamilyLunchVegeRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeHandler {
    @Autowired
    private CoffeeCapacityRepository capacityRepository;
    @Autowired
    private CoffeeMilkAdditiveRepository milkAdditiveRepository;

    List<JSONObject> list = new ArrayList<>();

//    capacity + milk  后端判断 new Milk



    @GetMapping("/findAllParts")
    public  JSONObject findAllParts(){
        JSONObject resp = new JSONObject();
        resp.put("capacity",capacityRepository.findAll());
        resp.put("additive",milkAdditiveRepository.findAll());
        return resp;
    }

    @PostMapping("/addCoffee")
    public List<JSONObject> addPart(@RequestBody JSONObject json){
        String additive = json.getString("additive");
        String cap = json.getString("capacity");
        ICoffeeAdditives add = null;
        Coffee coffee = null;

        if(additive.equals("WholeMilk")){
            add = new WholeMilk();
        }else {
            add = new NoMilk();
        }
        if(cap.equals("Large")){
            coffee = new LargeCoffee(add);
        }else if(cap.equals("Medium")){
            coffee = new MediumCoffee(add);
        }else{
            coffee = new SmallCoffee(add);
        }
        list.add(coffee.order());
        return list;
    }










//    @GetMapping("/findAll/{page}/{size}")
//    public Page<Book> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size){
//        PageRequest request = PageRequest.of(page,size);
//        return bookRepository.findAll(request);
//    }

//    @PostMapping("/save")
//    public String save(@RequestBody Book book){
//        Book result = bookRepository.save(book);
//        if(result != null){
//            return "success";
//        }else{
//            return "error";
//        }
//    }
//
//    @GetMapping("/findById/{id}")
//    public Book findById(@PathVariable("id") Integer id){
//        return bookRepository.findById(id).get();
//    }
//
//    @PutMapping("/update")
//    public String update(@RequestBody Book book){
//        Book result = bookRepository.save(book);
//        if(result != null){
//            return "success";
//        }else{
//            return "error";
//        }
//    }
//
//    @DeleteMapping("/deleteById/{id}")
//    public void deleteById(@PathVariable("id") Integer id){
//        bookRepository.deleteById(id);
//    }
}
