package org.ul.dpproj.controller;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.ul.dpproj.DpprojApplication;
import org.ul.dpproj.entity.memento.FamilyLunchCaretaker;
import org.ul.dpproj.entity.memento.FamilyLunchMemento;
import org.ul.dpproj.entity.memento.FamilyLunchOriginator;
import org.ul.dpproj.entity.memento.Staple;
import org.ul.dpproj.repository.memento.FamilyLunchSauceRepository;
import org.ul.dpproj.repository.memento.FamilyLunchStapleRepository;
import org.ul.dpproj.repository.memento.FamilyLunchVegeRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DpprojApplication.class)
class FamilyLunchHandlerTest {
    @Autowired
    private FamilyLunchStapleRepository stapleRepository;
    @Autowired
    private FamilyLunchSauceRepository sauceRepository;
    @Autowired
    private FamilyLunchVegeRepository vegeRepository;

    private FamilyLunchOriginator o=new FamilyLunchOriginator();
    private FamilyLunchCaretaker c=new FamilyLunchCaretaker();

    @BeforeEach
    void setUp() {
        System.out.println("---------------Before the Junit4 test---------------");
    }

    @AfterEach
    void tearDown() {
        System.out.println("---------------After the Junit4 test---------------");
    }

    @Test
    void findAllParts() {
        System.out.println("findAllParts() method in the Junit4 test:");
        List<Staple> list = stapleRepository.findAll();
        for(Staple d:list){
            System.out.println(d);
        }
    }

    @Test
    void addAndCancelPart() {
        System.out.println("addAndCancelPart() method in the Junit4 test:");
        o.setStaple("Pizza");
        o.setSauce("Salad");
        o.setVegetable("Carrot");
        c.addFamilyLunch(o.createFamilyLunchMemento());
        List<FamilyLunchMemento> list = c.getFamilyLunchList();
        System.out.println("The part we add is:");
        for(FamilyLunchMemento f:list){
            System.out.println(f.getStaple()+" "+f.getSauce()+" "+f.getVegetable());
        }
        FamilyLunchMemento result = o.setFamilyLunchMemento(c.cancelFamilyLunch());
        System.out.println("The part we cancel is:");
        System.out.println(result.getStaple()+" "+result.getSauce()+" "+result.getVegetable());
    }
}