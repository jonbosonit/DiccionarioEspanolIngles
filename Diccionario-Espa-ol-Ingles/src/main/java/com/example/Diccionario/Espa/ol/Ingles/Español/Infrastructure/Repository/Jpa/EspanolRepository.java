package com.example.Diccionario.Espa.ol.Ingles.Español.Infrastructure.Repository.Jpa;

import com.example.Diccionario.Espa.ol.Ingles.Español.Domain.Espanol;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EspanolRepository extends JpaRepository<Espanol,Integer> {
    Optional<Espanol> findByPalabra(String palabra);
}
