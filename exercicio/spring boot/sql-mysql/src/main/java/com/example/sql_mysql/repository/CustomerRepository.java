package com.example.sql_mysql.repository;

import com.example.sql_mysql.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel,Integer> {

}
