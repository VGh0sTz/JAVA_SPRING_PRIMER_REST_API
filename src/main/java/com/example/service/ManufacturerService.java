package com.example.service;

import com.example.model.Manufacturer;

import java.util.List;
import java.util.Optional;

/*
CRUD:
CREATE
RETRIEVE/READ
UPDATE
DELETE
*/

public interface ManufacturerService {
    //METODOS DE CONSULTAS (RETRIEVE)
    List<Manufacturer> findAll();
    List<Manufacturer> findAllByYear(Integer year);
    Optional<Manufacturer> findById(Long id);
    Optional<Manufacturer> findByName(String name);

    //CREATE
    Manufacturer save(Manufacturer manufacturer);

    //DELETE
    void deleteById(Long id);
    void deleteAll();

    //Más Lógica de negocio
    // 1. Coches fabricados
    // 2. Beneficios obtenidos
    // 3. ...
}
