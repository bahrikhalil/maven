package com.example.fok.controllers;



import com.example.fok.repo.BookRepo;
import com.example.fok.models.book;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200/")
public class BookController {
    private BookRepo bookRepo;

    public BookController (BookRepo bookRepo){ this.bookRepo=bookRepo;
    }


    @GetMapping("/h")
    public List<book> getallbooks(){ return bookRepo.findAll();}


    @PostMapping("/add")
    public void create(@RequestBody book book1) { bookRepo.save(book1);
    }

    @DeleteMapping("del")
    public void delete(){bookRepo.deleteAll();}

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();}


}
