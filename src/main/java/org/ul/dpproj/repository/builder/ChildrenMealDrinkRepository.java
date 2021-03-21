package org.ul.dpproj.repository.builder;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.builder.Drink;

public interface ChildrenMealDrinkRepository extends JpaRepository<Drink,Integer> {
}
