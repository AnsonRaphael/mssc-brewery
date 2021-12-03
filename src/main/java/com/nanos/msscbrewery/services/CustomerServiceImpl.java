package com.nanos.msscbrewery.services;

import com.nanos.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public  class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().
                customerName("nanos")
                .customerId(customerId)
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().customerName(customerDto.getCustomerName())
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.info("updated updateCustomer data");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("deleted deleteCustomer data");
    }

}
