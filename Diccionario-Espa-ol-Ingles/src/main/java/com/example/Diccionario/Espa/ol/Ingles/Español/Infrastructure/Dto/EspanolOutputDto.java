package com.example.Diccionario.Espa.ol.Ingles.Español.Infrastructure.Dto;

import com.example.Diccionario.Espa.ol.Ingles.Español.Domain.Espanol;
import com.example.Diccionario.Espa.ol.Ingles.Ingles.Infrastructure.Dto.InglesSimpleOutputDto;
import com.example.Diccionario.Espa.ol.Ingles.Ingles.Infrastructure.Repository.Jpa.InglesRepository;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EspanolOutputDto extends EspanolSimpleOutputDto {

    List<InglesSimpleOutputDto> palabrasIngles;

    public EspanolOutputDto (Espanol espanol, InglesRepository inglesRepository){
        setDescripcion(espanol.getDescripcion());
        setId(espanol.getId());
        setPalabra(espanol.getPalabra());
        setFecha_alta(espanol.getFecha_alta());
        setFecha_modif(espanol.getFecha_modif());

    }
}
