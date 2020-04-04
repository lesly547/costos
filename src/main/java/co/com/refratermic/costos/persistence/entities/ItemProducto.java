package co.com.refratermic.costos.persistence.entities;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class ItemProducto {

    @Id
    private Long id;
    private Long id_producto;
    private Long id_item;
    private Double rendimiento;
    private Double valor_unitario;
    private Double valor_total;

}
