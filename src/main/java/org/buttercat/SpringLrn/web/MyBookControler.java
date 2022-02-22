package org.buttercat.SpringLrn.web;

import org.buttercat.SpringLrn.dto.Bird;
import org.buttercat.SpringLrn.dto.Book;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("book")
public class MyBookControler {

    //List<Book> books = new ArrayList<>();
    AtomicInteger atomicInt = new AtomicInteger(0);
    HashMap<Integer, Book> books = new HashMap<Integer, Book>();

    @PostMapping("/addbook")
    public String AddBook(@RequestBody Book book) {
        books.put(atomicInt.incrementAndGet(), book);
        return "adding complete";
    }

    @GetMapping("/authors")
    public TreeSet<String> getAuthors() {
        TreeSet<String> authors = new TreeSet<String>();

        for(Map.Entry<Integer, Book> b : books.entrySet()) {
            authors.add(b.getValue().getAuthor());
        }
        return authors;
    }

    @GetMapping("/allbooks")
    public String getAllBooks() {
        return books.toString();
    }

    @DeleteMapping("/delete")
    public String deleteBook(@RequestParam(value="id") Integer id){
        if(books.containsKey(id)) {
            books.remove(id);
        }
        return "deleting complete";
    }
}
