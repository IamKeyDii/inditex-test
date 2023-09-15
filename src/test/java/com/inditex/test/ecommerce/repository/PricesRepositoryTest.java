package com.inditex.test.ecommerce.repository;

import com.inditex.test.ecommerce.model.Prices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class PricesRepositoryTest {
    
    @Autowired
    private PricesRepository pricesRepository;
    
    @Test
    void GIVEN_test1_WHEN_pruebaInditex_THEN_pricesList(){

        Long brandId = 1L;
        Integer productId = 35455;
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-14T10:00:00Z");
        
        List<Prices> pricesList = 
                pricesRepository.findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(
                        brandId, productId, applicationDate, applicationDate);

        Assertions.assertEquals(1, pricesList.size());
    }

    @Test
    void GIVEN_test2_WHEN_pruebaInditex_THEN_pricesList(){

        Long brandId = 1L;
        Integer productId = 35455;
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-14T16:00:00Z");

        List<Prices> pricesList =
                pricesRepository.findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(
                        brandId, productId, applicationDate, applicationDate);

        Assertions.assertEquals(2, pricesList.size());
    }

    @Test
    void GIVEN_test3_WHEN_pruebaInditex_THEN_pricesList(){

        Long brandId = 1L;
        Integer productId = 35455;
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-14T21:00:00Z");

        List<Prices> pricesList =
                pricesRepository.findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(
                        brandId, productId, applicationDate, applicationDate);

        Assertions.assertEquals(1, pricesList.size());
    }

    @Test
    void GIVEN_test4_WHEN_pruebaInditex_THEN_pricesList(){

        Long brandId = 1L;
        Integer productId = 35455;
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-15T10:00:00Z");

        List<Prices> pricesList =
                pricesRepository.findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(
                        brandId, productId, applicationDate, applicationDate);

        Assertions.assertEquals(1, pricesList.size());
    }

    @Test
    void GIVEN_test5_WHEN_pruebaInditex_THEN_pricesList(){

        Long brandId = 1L;
        Integer productId = 35455;
        OffsetDateTime applicationDate = OffsetDateTime.parse("2020-06-16T21:00:00Z");

        List<Prices> pricesList =
                pricesRepository.findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(
                        brandId, productId, applicationDate, applicationDate);

        Assertions.assertEquals(2, pricesList.size());
    }
    
}
