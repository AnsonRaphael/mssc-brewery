package com.nanos.msscbrewery.services;

import com.nanos.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updatebeer(UUID beerId, BeerDto beerDto);

    void deleteBeer(UUID beerId);
}
