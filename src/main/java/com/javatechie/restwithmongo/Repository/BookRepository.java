package com.javatechie.restwithmongo.Repository;

import com.javatechie.restwithmongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
