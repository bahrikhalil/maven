package com.example.fok.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookid;
    private String name;
    private String pwd;
    @NonNull
    private int price;

}