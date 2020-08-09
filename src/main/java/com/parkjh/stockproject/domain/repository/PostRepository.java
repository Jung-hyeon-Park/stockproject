package com.parkjh.stockproject.domain.repository;

import com.parkjh.stockproject.domain.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> { }
