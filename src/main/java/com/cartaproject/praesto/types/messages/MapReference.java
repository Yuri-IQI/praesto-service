package com.cartaproject.praesto.types.messages;

import com.cartaproject.praesto.types.enums.MapScopeEnum;
import jakarta.validation.constraints.Null;

import java.io.Serializable;

public record MapReference(
        String userReg,
        String name,
        MapScopeEnum mapScope,
        String category
) implements Serializable { }