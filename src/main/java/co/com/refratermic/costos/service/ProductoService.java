package co.com.refratermic.costos.service;

import co.com.refratermic.costos.persistence.entities.Producto;
import co.com.refratermic.costos.persistence.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> consultarDescripcion (String descripcion){

        return productoRepository.consultarDescripcion(descripcion);
    }
}
