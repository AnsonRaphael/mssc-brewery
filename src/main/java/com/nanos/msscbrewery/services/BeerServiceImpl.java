package com.nanos.msscbrewery.services;

import com.nanos.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService{

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().beerName("beer 1")
                .beerId(beerId)
                .beerStyle("no clue")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return BeerDto.builder().beerName(beerDto.getBeerName())
                .beerId(UUID.randomUUID())
                .beerStyle(beerDto.getBeerStyle())
                .upc(beerDto.getUpc())
                .build();
    }

    @Override
    public void updatebeer(UUID beerId, BeerDto beerDto) {
        // to -do later
        log.info("updatebeer data");
    }

    @Override
    public void deleteBeer(UUID beerId) {
      log.info("deleted deleteBeer data");
    }
}
