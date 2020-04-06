package co.com.refratermic.costos.persistence.repository;

import co.com.refratermic.costos.persistence.entities.ItemProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemProductoRepository extends JpaRepository<ItemProducto,Long> {


}
