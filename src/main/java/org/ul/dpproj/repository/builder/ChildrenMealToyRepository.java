package org.ul.dpproj.repository.builder;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.builder.Toy;

public interface ChildrenMealToyRepository extends JpaRepository<Toy,Integer> {
}
