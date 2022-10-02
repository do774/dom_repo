package com.example.webapp5.repositories;


import com.example.webapp5.domain.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
