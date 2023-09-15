package com.inditex.test.ecommerce.service;

import com.inditex.test.ecommerce.model.Prices;
import com.inditex.test.ecommerce.repository.PricesRepository;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Prices service class
 */
@Component
public class PricesService {
    
    @Autowired
    private PricesRepository pricesRepository;

    /**
     * Service that finds a price By BrandId And ProductId And StartDate LessThan And
     *  EndDate GreaterThan.
     * @param brandId the brand identifier.
     * @param productId the product identifier.
     * @param actualDate the actual date.
     * @return Prices
     */
    public Prices findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(Long brandId,
                                                                                     Integer productId,
                                                                                     OffsetDateTime actualDate) {
        
        Optional<Prices> optionalPrice = this.pricesRepository
                .findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(
                        brandId, productId, actualDate, actualDate)
                .stream()
                .max(Comparator.comparing(Prices::getPriority));

        return optionalPrice.orElse(new Prices());
    }
    
    public List<Prices> getAllPrices(){
        return this.pricesRepository.findAll();
    }
    
}
