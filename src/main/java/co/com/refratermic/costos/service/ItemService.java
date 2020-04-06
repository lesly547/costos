package co.com.refratermic.costos.service;

import co.com.refratermic.costos.persistence.entities.Item;
import co.com.refratermic.costos.persistence.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> consultarNombre (String nombre){

        return itemRepository.consultarItemXNombre(nombre);
    }
}
