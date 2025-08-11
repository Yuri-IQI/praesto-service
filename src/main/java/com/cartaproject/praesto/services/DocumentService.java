package com.cartaproject.praesto.services;

import com.cartaproject.praesto.models.MapSchema;
import com.cartaproject.praesto.repositories.MapRepository;
import com.cartaproject.praesto.types.enums.StatusEnum;
import com.cartaproject.praesto.types.messages.MapReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private MapRepository mapRepository;

    public void createReference(MapReference reference) {
        MapSchema schema = new MapSchema();
        schema.setUserReg(reference.userReg());
        schema.setName(reference.name());
        schema.setMapScope(reference.mapScope());
        schema.setStatus(StatusEnum.ACTIVE);
        schema.setCategory(reference.category());

        mapRepository.save(schema);
    }
}