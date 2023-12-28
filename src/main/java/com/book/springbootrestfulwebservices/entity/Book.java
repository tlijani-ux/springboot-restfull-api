package com.book.springbootrestfulwebservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
   the @Entity annotation in springboot and JPA is used  to mark a class as an entity
   , in the jpa specification
   , an entity represent a persistent object that stored in db
 */

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false, unique = true, length = 2500)
    private String description;
    @Column(nullable = false)
    private String genre;
}
