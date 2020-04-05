package co.com.refratermic.costos.persistence.entities;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter

public class Producto {

    @Id
    private Long id;
    private String descripcion;
    private String unidad_medida;


}
