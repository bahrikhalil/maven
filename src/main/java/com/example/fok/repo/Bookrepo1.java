package com.example.fok.repo;

import com.example.fok.models.book;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface Bookrepo1 extends JpaRepository<book,Integer> {


}
