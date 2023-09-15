package com.inditex.test.ecommerce.repository;

import com.inditex.test.ecommerce.model.Prices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * the prices repository that extends jpa
 */
@Repository
public interface PricesRepository extends JpaRepository<Prices, Long> {

List<Prices> findByBrandIdAndProductIdAndStartDateLessThanAndEndDateGreaterThan(Long brandId, 
                                                                                Integer productId,
                                                                                OffsetDateTime afterStartDate,
                                                                                OffsetDateTime beforeEndDate);
}

