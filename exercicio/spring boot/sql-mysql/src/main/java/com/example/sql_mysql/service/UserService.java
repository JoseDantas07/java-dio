package com.example.sql_mysql.service;

import java.math.BigDecimal;

public interface UserService {

    void addCustomer(String name,String cpf);

    void displayCustomer();

    void removerById(Integer id);

    void addBalance(Integer id, BigDecimal balance);
}
