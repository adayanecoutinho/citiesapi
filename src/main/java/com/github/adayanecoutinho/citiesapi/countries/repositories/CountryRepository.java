package com.github.adayanecoutinho.citiesapi.countries.repositories;

import com.github.adayanecoutinho.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
