package org.ul.dpproj.repository.builder;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.memento.Vegetable;

public interface ChildrenMealVegetableRepository extends JpaRepository<Vegetable,Integer> {
}
