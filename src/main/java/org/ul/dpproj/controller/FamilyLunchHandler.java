package org.ul.dpproj.controller;


import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ul.dpproj.entity.memento.FamilyLunchCaretaker;
import org.ul.dpproj.entity.memento.FamilyLunchMemento;
import org.ul.dpproj.entity.memento.FamilyLunchOriginator;
import org.ul.dpproj.repository.FamilyLunchSauceRepository;
import org.ul.dpproj.repository.FamilyLunchStapleRepository;
import org.ul.dpproj.repository.FamilyLunchVegeRepository;



import java.util.List;

@RestController
@RequestMapping("/familylunch")
public class FamilyLunchHandler {
    @Autowired
    private FamilyLunchStapleRepository stapleRepository;
    @Autowired
    private FamilyLunchSauceRepository sauceRepository;
    @Autowired
    private FamilyLunchVegeRepository vegeRepository;

    private FamilyLunchOriginator o=new FamilyLunchOriginator();
    private FamilyLunchCaretaker c=new FamilyLunchCaretaker();

    @GetMapping("/findAllParts")
    public  JSONObject findAllParts(){
        JSONObject resp = new JSONObject();
        resp.put("staple",stapleRepository.findAll());
        resp.put("sauce",sauceRepository.findAll());
        resp.put("vegetable",vegeRepository.findAll());
        return resp;
    }

    @PostMapping("/addPart")
    public List<FamilyLunchMemento> addPart(@RequestBody FamilyLunchMemento fl){

        o.setStaple(fl.getStaple());
        o.setSauce(fl.getSauce());
        o.setVegetable(fl.getVegetable());
        c.addFamilyLunch(o.createFamilyLunchMemento());
        return c.getFamilyLunchList();

    }

    @PostMapping("/cancelPart")
    public List<FamilyLunchMemento> cancelPart(){
        FamilyLunchMemento result = o.setFamilyLunchMemento(c.cancelFamilyLunch());

        return c.getFamilyLunchList();
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
