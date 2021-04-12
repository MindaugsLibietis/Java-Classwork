package com.rcs.classwork.Day22;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;

    public Book (String name, Author[] authors) {
        this.name = name;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
