package co.com.refratermic.costos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/ingresarItem")
public class ItemController {

    @GetMapping("/")
    public String holaMundo(){
        return "Hola Mundo";
    }

}
