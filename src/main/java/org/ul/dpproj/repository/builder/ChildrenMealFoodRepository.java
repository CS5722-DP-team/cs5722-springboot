package org.ul.dpproj.repository.builder;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.builder.Food;

public interface ChildrenMealFoodRepository extends JpaRepository<Food,Integer> {
}
