package com.example.Diccionario.Espa.ol.Ingles.Ingles.Infrastructure.Dto;

import com.example.Diccionario.Espa.ol.Ingles.Español.Infrastructure.Dto.EspanolSimpleOutputDto;
import com.example.Diccionario.Espa.ol.Ingles.Español.Infrastructure.Repository.Jpa.EspanolRepository;
import com.example.Diccionario.Espa.ol.Ingles.Exception.ErrorException;
import com.example.Diccionario.Espa.ol.Ingles.Ingles.Domain.Ingles;
import com.example.Diccionario.Espa.ol.Ingles.Ingles.Infrastructure.Repository.Jpa.InglesRepository;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class InglesOutputDto extends InglesSimpleOutputDto{

    Integer id;
    String palabra;
    String palabraEspanol;
    Date fecha_alta;
    Date fecha_modif;
    String descripcion;

    EspanolSimpleOutputDto espanolSimpleOutputDto;

    public InglesOutputDto(Ingles ingles) {
        super(ingles);
        setPalabraEspanol(ingles.getEspanol().getPalabra());
        setEspanolSimpleOutputDto(new EspanolSimpleOutputDto(ingles.getEspanol()));

    }
}
