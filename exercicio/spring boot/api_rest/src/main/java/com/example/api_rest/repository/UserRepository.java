package com.example.api_rest.repository;

import com.example.api_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    boolean existByAccountNumber(String accountNumber);
}
