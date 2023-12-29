package com.book.springbootrestfulwebservices.controller;

import com.book.springbootrestfulwebservices.entity.Book;
import com.book.springbootrestfulwebservices.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookService bookService;
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book savedBook=bookService.createBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long bookId){
        Book book= bookService.getBookById(bookId);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Book>>getAllBook(){
        List<Book> bookList=bookService.getAllBooks();
        return new ResponseEntity<>(bookList,HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long bookId){
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book was deleted successfully",HttpStatus.OK);
    }


}
