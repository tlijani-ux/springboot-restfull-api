package com.book.springbootrestfulwebservices.service.implementation;

import com.book.springbootrestfulwebservices.entity.Book;
import com.book.springbootrestfulwebservices.repository.BookRepository;
import com.book.springbootrestfulwebservices.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

public class BookImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long bookId) {
        Optional<Book> optionalBook = bookRepository.findById(bookId);
        return optionalBook.get();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Book book) {
     return null

             ;    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);

    }
}
