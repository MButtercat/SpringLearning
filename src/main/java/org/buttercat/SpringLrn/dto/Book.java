package org.buttercat.SpringLrn.dto;

public class Book {
    private String author;
    private String title;
    private int edition;

    public Book(String author, String title, int edition) {
        this.author = author;
        this.title = title;
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", edition=" + edition +
                '}';
    }
}
