package org.ul.dpproj.entity.adapter;

//Adaptee
public class Balcony implements RoomType{
    @Override
    public String roomName() {
        return "A Balcony ";
    }
}
