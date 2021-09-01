package com.example.Diccionario.Espa.ol.Ingles.Español.Infrastructure.Dto;

import com.example.Diccionario.Espa.ol.Ingles.Español.Domain.Espanol;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class EspanolSimpleOutputDto {

    Integer id;
    String palabra;
    String descripcion;
    Date fecha_alta;
    Date fecha_modif;

    public EspanolSimpleOutputDto(Espanol espanol){
        setId(espanol.getId());
        setPalabra(espanol.getPalabra());
        setDescripcion(espanol.getDescripcion());
        setFecha_alta(espanol.getFecha_alta());
        setFecha_modif(espanol.getFecha_modif());
    }
}
