package com.example.webapp5.repositories;


import com.example.webapp5.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
