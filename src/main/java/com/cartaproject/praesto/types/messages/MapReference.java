package com.cartaproject.praesto.types.messages;

import com.cartaproject.praesto.types.enums.MapScopeEnum;
import jakarta.validation.constraints.Null;

public record MapReference(
        @Null String userReg,
        String name,
        MapScopeEnum mapScope,
        String category
) { }