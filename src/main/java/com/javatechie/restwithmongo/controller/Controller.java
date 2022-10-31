package com.javatechie.restwithmongo.controller;

import com.javatechie.restwithmongo.Repository.BookRepository;
import com.javatechie.restwithmongo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private BookRepository repository;

    @GetMapping("/get")
    private List<Book> getBook(){
        return repository.findAll();
    }

    @PostMapping("/add")
    private String add(@RequestBody Book book){
        repository.save(book);
        return "Added book with ID" + book.getId();
    }

    @GetMapping("/getBookById/{id}")
    private Optional<Book> getBookById(@PathVariable Integer id){
        return repository.findById(id);
       // return repository.findAll().get(1);
    }

    @DeleteMapping("/deleteById/{id}")
    private String deleteById(@PathVariable Integer id){
        repository.deleteById(id);
        return "Deleted Book with ID" + id;
    }
}
