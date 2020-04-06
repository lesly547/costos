package co.com.refratermic.costos.persistence.repository;

import co.com.refratermic.costos.persistence.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {

    @Query("SELECT p FROM Item p WHERE p.nombre LIKE %:nombre%")
    public List<Item> consultarItemXNombre (@Param("nombre")String nombre);
}
