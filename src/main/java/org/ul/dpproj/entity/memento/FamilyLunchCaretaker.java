package org.ul.dpproj.entity.memento;

import java.util.ArrayList;

public class FamilyLunchCaretaker {
    private ArrayList<FamilyLunchMemento> list=null;

    public FamilyLunchCaretaker() {
        list=new ArrayList<FamilyLunchMemento>();
    }

    public void addFamilyLunch(FamilyLunchMemento m){
        list.add(m);
    }
    public ArrayList<FamilyLunchMemento> getFamilyLunchList(){
        return this.list;
    }
    public FamilyLunchMemento cancelFamilyLunch() {
        if(list.isEmpty()) {
            System.out.println("cannot cancel");
            return null;
        }else {
            int index=list.size();
            FamilyLunchMemento m=list.get(index-1);
            list.remove(index-1);
            return m;
        }
    }

}
