package com.book.springbootrestfulwebservices.service;


import com.book.springbootrestfulwebservices.entity.Book;

import java.util.List;

public interface BookService {


    Book createBook(Book book);

    Book getBookById(Long bookId);

    List<Book> getAllBooks();

    Book updateBook(Book book);

    void deleteBook(Long bookId);


}
