package co.com.refratermic.costos.persistence.repository;

import co.com.refratermic.costos.persistence.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {

    @Query("SELECT p FROM Producto p WHERE p.descripcion LIKE %:descripcion%")
    public List<Producto> consultarDescripcion (@Param("descripcion")String descripcion);

}
