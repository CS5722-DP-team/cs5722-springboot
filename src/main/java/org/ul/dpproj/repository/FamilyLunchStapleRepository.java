package org.ul.dpproj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.Book;
import org.ul.dpproj.entity.memento.Staple;

public interface FamilyLunchStapleRepository extends JpaRepository<Staple,Integer> {
}
