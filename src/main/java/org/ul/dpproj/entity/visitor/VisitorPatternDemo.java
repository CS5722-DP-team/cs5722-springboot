package org.ul.dpproj.entity.visitor;

import org.ul.dpproj.entity.memento.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {
    public static List<BurgerPart> getList(){
        List<BurgerPart> list = new ArrayList<BurgerPart>();
        Chicken c = new Chicken("6");
        Sop s = new Sop("white");
        Vegtable v = new Vegtable("carrot");
        list.add(c);
        list.add(s);
        list.add(v);
        return list;
    }

}



