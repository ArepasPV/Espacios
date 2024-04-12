package com.explorenest.espacios.controller;

import com.explorenest.espacios.domain.espacios;
import com.explorenest.espacios.service.espaciosService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("api/espacios")
public class espaciosController {
    @Autowired
    private espaciosService espaciosService;

    @GetMapping("list_espacios")
    public List<espacios> getEspacios(){
        return espaciosService.getAllEspacios();
    }

    @GetMapping("espacios_por_id")
    public Optional<espacios> getEspaciosById(Integer id){
        return espaciosService.getEspaciosById(id);
    }

    @GetMapping("espacios_por_hotel_id")
    public Optional<List<espacios>> getEspaciosByHotelId(Integer hotel_id){
        return espaciosService.getEspaciosByHotelId(hotel_id);
    }

    @GetMapping("espacios_por_capacidad")
    public Optional<List<espacios>> getEspaciosByCapacidad(Integer capacidad){
        return espaciosService.getEspaciosByCapacidad(capacidad);
    }

    @GetMapping("espacios_por_precio")
    public Optional<List<espacios>> getEspaciosByPrecio(Double precio){
        return espaciosService.getEspaciosByPrecio(precio);
    }
    
}
