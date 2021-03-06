package com.github.adayanecoutinho.citiesapi.staties.repositories;

import com.github.adayanecoutinho.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
