package com.parkjh.covidproject.domain.repository;

import com.parkjh.covidproject.domain.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> { }
