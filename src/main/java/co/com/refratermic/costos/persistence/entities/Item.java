package co.com.refratermic.costos.persistence.entities;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Item {

    @Id
    private Long id;
    private String nombre;
}
