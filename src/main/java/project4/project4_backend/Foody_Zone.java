package project4.project4_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Foody_Zone")
public class Foody_Zone {
    
    @Id
    private Integer id;

    private String name;
    private double price;
    private String text;
    private String image;
    private String type;

}
