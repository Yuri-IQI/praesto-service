package com.cartaproject.praesto.repositories;

import com.cartaproject.praesto.models.MapSchema;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MapRepository extends MongoRepository<MapSchema, String> {
}