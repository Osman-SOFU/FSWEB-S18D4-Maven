package com.workintech.s18d1.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BurgerErrorResponse {
    private String message;
}
