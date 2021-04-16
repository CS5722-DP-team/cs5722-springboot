package org.ul.dpproj.repository.visitor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.memento.Vegetable;
import org.ul.dpproj.entity.visitor.Chicken;

public interface BurgerPartChickenRepository extends JpaRepository<Chicken,Integer> {
}
