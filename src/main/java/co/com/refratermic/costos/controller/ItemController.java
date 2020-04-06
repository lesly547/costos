package co.com.refratermic.costos.controller;

import co.com.refratermic.costos.persistence.entities.Item;
import co.com.refratermic.costos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/consultaItem")
    public List<Item> consultarNombre (@RequestParam String nombre){

        return itemService.consultarNombre(nombre);
    }
}
