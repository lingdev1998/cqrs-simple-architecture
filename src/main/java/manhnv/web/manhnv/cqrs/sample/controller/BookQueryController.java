package manhnv.web.manhnv.cqrs.sample.controller;

import manhnv.web.manhnv.cqrs.sample.entity.Book;
import manhnv.web.manhnv.cqrs.sample.service.IBookQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookQueryController {

    @Autowired
    private IBookQueryService bookQueryService;

    @GetMapping("/books")
    @ResponseBody
    public List<Book> allBooks() {
        return bookQueryService.getAllBooks();
    }

    @GetMapping("/books/{bookId}")
    @ResponseBody
    public ResponseEntity<Book> bookInfo(@PathVariable("bookId") String bookId) {
        Book bookInfo = bookQueryService.getBookInfo(bookId);
        if (bookInfo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(bookInfo);
    }
}
