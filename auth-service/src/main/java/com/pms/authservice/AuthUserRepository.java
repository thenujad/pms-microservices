package com.pms.authservice;


import com.pms.authservice.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
