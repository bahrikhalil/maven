package com.example.fok.service;
import com.example.fok.models.book;
import com.example.fok.repo.BookRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;


@Service
public class UserService implements UserDetailsService {

    private final BookRepo bookRepo;
    public UserService(BookRepo bookRepo){this.bookRepo=bookRepo;}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        book book1 = bookRepo.findByName(username);

        if (book1 == null) {
            throw new UsernameNotFoundException("book not found in the database");
        }


        return new org.springframework.security.core.userdetails.User(
                book1.getName(), book1.getPwd(), new ArrayList<>());
    }}