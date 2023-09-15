package com.inditex.test.ecommerce.controller;

import com.inditex.test.ecommerce.service.PricesService;
import com.inditex.test.ecommerce.model.Prices;
import com.inditex.test.ecommerce.model.request.PricesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/prices")
public class PricesController {
    
    @Autowired
    private PricesService pricesService;

    /**
     * Method that works as and endpoint for the find Prueba Inditex.
     * @param pricesRequest The request body.
     * @return Response entity with prices
     */
    @GetMapping("/findPruebaInditex")
    public ResponseEntity<Prices> findPruebaInditex(@RequestBody PricesRequest pricesRequest) {

        Prices price = pricesService.findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(pricesRequest.getBrandId(),
                pricesRequest.getProductId(), pricesRequest.getApplicationDate());

        return ResponseEntity.ok(price);
    }

    /**
     * Method that works as and endpoint for find all (test purposes).
     * @return a list of prices.
     */
    @GetMapping("/findAll")
    public List<Prices> getAllPrices(){
        return pricesService.getAllPrices();
    }
    
    
    
    
}
