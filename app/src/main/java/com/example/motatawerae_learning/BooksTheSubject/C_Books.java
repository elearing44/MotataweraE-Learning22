package com.example.motatawerae_learning.BooksTheSubject;

public class C_Books {
    int id;
    String name;
    String description;
    String book_type;

    public  C_Books(int id , String name , String description , String book_type)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.book_type = book_type;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBook_type() {
        return book_type;
    }
}
