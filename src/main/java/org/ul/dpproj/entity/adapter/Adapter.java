package org.ul.dpproj.entity.adapter;

public class Adapter extends Kitchen {
    private RoomType room;
    public Adapter(RoomType room){
        this.room = room;
    }
    @Override
    public String isKitchen(){
        return super.isKitchen()+" transformed by "+room.roomName();
    }

}
