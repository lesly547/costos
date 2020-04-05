package co.com.refratermic.costos.controller;

import co.com.refratermic.costos.persistence.entities.Producto;
import co.com.refratermic.costos.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/consultaProducto")
    public List<Producto> consultaProducto (@RequestParam String descripcion){

        return productoService.consultarDescripcion(descripcion);
    }
}
