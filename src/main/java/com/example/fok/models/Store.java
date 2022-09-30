package com.example.fok.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeid;
    private String name;
    @OneToMany(targetEntity = book.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "book_fk", referencedColumnName = "bookid")
    private List<book> bookList;

}

