package project4.project4_backend;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/food")
@CrossOrigin("*")
public class Foody_ZoneController {

    @Autowired
    Foody_ZoneRepo ifoody_zoneRepo;

    @PostMapping("/add-food")
    public void addFood(@RequestBody Foody_Zone foody_zone) {
        ifoody_zoneRepo.save(foody_zone);
    }

    @GetMapping("get-food")
    public List<Foody_Zone> getFood() {
        List<Foody_Zone> foods = ifoody_zoneRepo.findAll();
        return foods;
    }

    @GetMapping("/search-food")
    public List<Foody_Zone> searchFood(@RequestParam String name) {
        List<Foody_Zone> foods = ifoody_zoneRepo.findByNameContainingIgnoreCase(name);
        return foods;
    }

    // @GetMapping("/get-food/{id}")
    // public Optional<Foody_Zone> getById(@PathVariable Integer id) {
    // Optional<Foody_Zone> food = ifoody_zoneRepo.findById(id);
    // return food;
    // }

    // @DeleteMapping("delete-foods")
    // public void deleteFoods() {
    // ifoody_zoneRepo.deleteAll();
    // }

    // @DeleteMapping("/delete-food/{id}")
    // public void deleteFoodById(@PathVariable Integer id) {
    // ifoody_zoneRepo.deleteById(id);
    // }
}
