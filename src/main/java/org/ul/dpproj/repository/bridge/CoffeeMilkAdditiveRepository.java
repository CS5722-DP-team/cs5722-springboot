package org.ul.dpproj.repository.bridge;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.bridge.Additive;

public interface CoffeeMilkAdditiveRepository extends JpaRepository<Additive,Integer> {
}
