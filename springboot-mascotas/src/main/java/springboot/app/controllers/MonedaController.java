package springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.app.modelos.Moneda;
import springboot.app.servicios.MonedaService;

@RestController
@RequestMapping("/moneda")
public class MonedaController {
    @Autowired
    private MonedaService monedaService;


    @GetMapping("moneda/{nombre}")
    public ResponseEntity<?> getMonedabyNombre(@PathVariable String nombre) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(monedaService.findByNombre(nombre));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }
   
    }

