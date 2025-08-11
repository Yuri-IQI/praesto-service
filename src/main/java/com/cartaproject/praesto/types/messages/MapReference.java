package com.cartaproject.praesto.types.messages;

import com.cartaproject.praesto.types.enums.MapScopeEnum;

public record MapReference(
        String userReg,
        String name,
        MapScopeEnum mapScope,
        String category
) { }