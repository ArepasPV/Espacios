package com.explorenest.espacios.service;

import com.explorenest.espacios.domain.espacios;
import com.explorenest.espacios.repository.espaciosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class espaciosService {
    private espaciosRepository espaciosRepository;

    public List<espacios> getAllEspacios(){
        return espaciosRepository.findAll();
    }

    public Optional<espacios> getEspaciosById(Integer id){
        return espaciosRepository.findOneById(id);
    }

    public Optional<List<espacios>> getEspaciosByHotelId(Integer hotel_id){
        return espaciosRepository.findEspaciosByHotelId(hotel_id);
    }

    public Optional<List<espacios>> getEspaciosByCapacidad(Integer capacidad){
        return espaciosRepository.findEspaciosByCapacidad(capacidad);
    }

    public Optional<List<espacios>> getEspaciosByPrecio(Double precio){
        return espaciosRepository.findEspaciosByPrecio(precio);
    }


}
