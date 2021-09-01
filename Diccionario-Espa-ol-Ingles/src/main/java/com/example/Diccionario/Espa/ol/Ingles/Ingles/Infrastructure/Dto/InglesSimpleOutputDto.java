package com.example.Diccionario.Espa.ol.Ingles.Ingles.Infrastructure.Dto;

import com.example.Diccionario.Espa.ol.Ingles.Ingles.Domain.Ingles;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class InglesSimpleOutputDto {

    Integer id;
    String palabra;
    Date fecha_alta;
    Date fecha_modif;
    String palabraEspanol;

    public InglesSimpleOutputDto(Ingles ingles){
        setId(ingles.getId());
        setPalabra(ingles.getPalabra());
        setFecha_alta(ingles.getFecha_alta());
        setFecha_modif(ingles.getFecha_modif());
        setPalabraEspanol(ingles.getEspanol().getPalabra());
    }
}
