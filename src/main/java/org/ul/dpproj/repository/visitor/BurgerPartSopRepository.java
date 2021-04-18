package org.ul.dpproj.repository.visitor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.memento.Vegetable;
import org.ul.dpproj.entity.visitor.Sop;

public interface BurgerPartSopRepository extends JpaRepository<Sop,Integer> {
}
