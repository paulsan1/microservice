package com.ms.act.CurrencyConFactor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ms.act.CurrencyConFactor.dto.ConversionFactor;
@Component
public interface ConversionFactorRepository extends JpaRepository<ConversionFactor, Integer> {

}
