package com.explorenest.espacios.repository;

import com.explorenest.espacios.domain.espacios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface espaciosRepository extends JpaRepository<espacios,Integer> {

Optional<espacios>findOneById(Integer Id);
Optional<List<espacios>> findEspaciosByHotelId(Integer hotel_id);
Optional<List<espacios>> findEspaciosByCapacidad(Integer capacidad);
Optional<List<espacios>> findEspaciosByPrecio(Double precio);

}
