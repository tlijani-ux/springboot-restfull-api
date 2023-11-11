package com.book.springbootrestfulwebservices.repository;

import com.book.springbootrestfulwebservices.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
