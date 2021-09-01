package com.example.Diccionario.Espa.ol.Ingles.Ingles.Infrastructure.Repository.Jpa;

import com.example.Diccionario.Espa.ol.Ingles.Ingles.Domain.Ingles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InglesRepository extends JpaRepository<Ingles,Integer> {
    Optional<Ingles> findByPalabra(String plabra);
    void deleteByPalabra(String palabra);

}
