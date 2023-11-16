package project4.project4_backend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Foody_ZoneRepo extends JpaRepository<Foody_Zone, Integer> {

    List<Foody_Zone> findByNameContainingIgnoreCase(String keyword);
    
}
