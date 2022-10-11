package com.example.webapp5.repositories;

import com.example.webapp5.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher, Long> {
}
