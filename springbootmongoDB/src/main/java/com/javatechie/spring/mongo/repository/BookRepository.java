package com.javatechie.spring.mongo.repository;

import com.javatechie.spring.mongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
