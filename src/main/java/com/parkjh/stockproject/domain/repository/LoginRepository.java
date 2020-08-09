package com.parkjh.stockproject.domain.repository;

import com.parkjh.stockproject.domain.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    Optional<LoginEntity> findByEmail(String userEmail);
}