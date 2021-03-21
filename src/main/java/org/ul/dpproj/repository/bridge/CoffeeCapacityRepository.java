package org.ul.dpproj.repository.bridge;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.bridge.Capacity;
import org.ul.dpproj.entity.memento.Sauce;

public interface CoffeeCapacityRepository extends JpaRepository<Capacity,Integer> {
}
