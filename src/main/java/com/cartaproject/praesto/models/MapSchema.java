package com.cartaproject.praesto.models;

import com.cartaproject.praesto.types.enums.MapScopeEnum;
import com.cartaproject.praesto.types.enums.StatusEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Data
@Document(collection = "maps")
public class MapSchema {
    @Id
    private String id;
    private String projectId;
    private String name;
    private Map<String, Object> data;
    private StatusEnum status;
    private MapScopeEnum mapScope;
}