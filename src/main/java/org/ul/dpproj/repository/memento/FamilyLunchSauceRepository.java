package org.ul.dpproj.repository.memento;


import org.springframework.data.jpa.repository.JpaRepository;
import org.ul.dpproj.entity.memento.Sauce;
import org.ul.dpproj.entity.memento.Staple;

public interface FamilyLunchSauceRepository extends JpaRepository<Sauce,Integer> {
}
