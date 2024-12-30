package com.marcelo.springbatchdemo.config;

import com.marcelo.springbatchdemo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if (customer.getCountry().equals("Brazil")) {
            return customer;
        } else {
            return null;
        }
    }
}
