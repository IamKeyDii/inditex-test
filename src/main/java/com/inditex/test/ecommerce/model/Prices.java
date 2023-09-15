package com.inditex.test.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.time.InstantSource;
import java.time.OffsetDateTime;

/**
 * Entidad prices.
 */
@Data
@Entity
@Table(name = "prices")
public class Prices {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    /**
     * Foreign key de la cadena del grupo (1 = ZARA).
     */
    @Column(name = "brand_id")
    Long brandId;

    /**
     * Fecha de inicio en el que aplica el precio tarifa indicado.
     */
    @Column(name = "start_date")
    OffsetDateTime startDate;

    /**
     * Fecha de fin en el que aplica el precio tarifa indicado.
     */
    @Column(name = "end_date")
    OffsetDateTime endDate;

    /**
     * Identificador de la tarifa de precios aplicable.
     */
    @Column(name = "price_list")
    Long priceList;

    /**
     * Identificador de código de producto.
     */
    @Column(name = "product_id")
    Integer productId;

    /**
     * Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rango de
     *      fechas se aplica la de mayor prioridad (mayor valor numérico).
     */
    Long priority;

    /**
     * Precio final de venta.
     */
    Double price;

    /**
     * Iso de la moneda.
     */
    String curr;
    /**
     *
     PRICES
     -------
     PRICE_LIST: 
     PRODUCT_ID: Identificador código de producto.
     PRIORITY: 
     PRICE: 
     CURR: 
     */
}
