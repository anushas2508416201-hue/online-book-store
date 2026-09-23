package com.bookstore;

import java.util.ArrayList;
import java.util.List;

public class App {

    static class Book {
        int id;
        String title;
        String author;
        double price;

        Book(int id, String title, String author, double price) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        @Override
        public String toString() {
            return id + " | " + title + " | " + author + " | ₹" + price;
        }
    }

    static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {

        addBook(1, "Java Programming", "James Gosling", 499);
        addBook(2, "Python Basics", "Guido van Rossum", 399);
        addBook(3, "Database Management", "Abraham Silberschatz", 599);
        addBook(4, "Computer Networks", "Andrew S. Tanenbaum", 699);

        System.out.println("===== ONLINE BOOK STORE =====");

        System.out.println("\nAvailable Books:");
        viewBooks();

        System.out.println("\nSearch Result for 'Java':");
        searchBooks("Java");
    }

    public static void addBook(int id, String title, String author, double price) {
        books.add(new Book(id, title, author, price));
    }

    public static void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static List<Book> searchBooks(String keyword) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.title.toLowerCase().contains(keyword.toLowerCase())
                    || book.author.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
                System.out.println(book);
            }
        }

        return result;
    }
}