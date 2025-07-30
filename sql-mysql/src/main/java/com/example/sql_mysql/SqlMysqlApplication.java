package com.example.sql_mysql;

import com.example.sql_mysql.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class SqlMysqlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SqlMysqlApplication.class, args);
	}
	@Autowired
	CustomerServiceImpl customerService;
	@Override
	public void run(String... args) throws Exception {
		customerService.addBalance(8,new BigDecimal(2000));
		customerService.displayCustomer();
	}
}
