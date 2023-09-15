package com.inditex.test.ecommerce.model.request;

import lombok.Data;

import java.time.Instant;
import java.time.OffsetDateTime;

/**
 * Clase para la request a la tabla prices
 */
@Data
public class PricesRequest {

    OffsetDateTime applicationDate;
    
    Integer productId;
    
    Long brandId;
    
    
}
