package org.ul.dpproj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.memento.Staple;
import org.ul.dpproj.entity.memento.Vegetable;

public interface FamilyLunchVegeRepository extends JpaRepository<Vegetable,Integer> {
}
