package org.ul.dpproj.repository.adapter;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.adapter.Room;
import org.ul.dpproj.entity.bridge.Capacity;

public interface ChangeRoomToKitchenRepository extends JpaRepository<Room,Integer> {
}
