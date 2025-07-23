package com.example.sql_mysql.service.impl;

import com.example.sql_mysql.model.CustomerModel;
import com.example.sql_mysql.repository.CustomerRepository;
import com.example.sql_mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CustomerServiceImpl implements UserService {
    @Autowired
    CustomerRepository customerRepository;

    public void addCustomer(String name,String cpf){
        CustomerModel customer = new CustomerModel();
        customer.setName(name);
        customer.setCpf(cpf);

        customerRepository.save(customer);
    }

    @Override
    public void displayCustomer() {
        customerRepository.findAll().forEach(System.out::println);
    }

    @Override
    public void removerById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void addBirthday(String id,BigDecimal balance) {

    }
}
