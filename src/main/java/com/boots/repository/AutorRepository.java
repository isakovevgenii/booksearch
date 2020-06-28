package com.boots.repository;

import com.boots.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Author, Long> {
}
