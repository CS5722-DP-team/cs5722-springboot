package org.ul.dpproj.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
