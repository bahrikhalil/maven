package com.example.fok.repo;

import com.example.fok.models.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<book,Integer> {
   // @Query("SELECT a FROM book a WHERE a.name =?1")
    book findByName(String b);
}
