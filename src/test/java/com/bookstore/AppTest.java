package com.bookstore;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddBook() {
        App.books.clear();

        App.addBook(1, "Java Programming", "James Gosling", 499);

        assertEquals(1, App.books.size());
        assertEquals("Java Programming", App.books.get(0).title);
    }

    @Test
    void testSearchBook() {
        App.books.clear();

        App.addBook(1, "Java Programming", "James Gosling", 499);
        App.addBook(2, "Python Basics", "Guido van Rossum", 399);

        List<App.Book> result = App.searchBooks("Java");

        assertEquals(1, result.size());
        assertEquals("Java Programming", result.get(0).title);
    }

    @Test
    void testSearchBookCaseInsensitive() {
        App.books.clear();

        App.addBook(1, "Java Programming", "James Gosling", 499);

        List<App.Book> result = App.searchBooks("java");

        assertEquals(1, result.size());
    }
}