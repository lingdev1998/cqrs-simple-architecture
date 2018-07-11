package manhnv.web.manhnv.cqrs.sample.service;

import manhnv.web.manhnv.cqrs.sample.entity.Book;

import java.util.List;

public interface IBookQueryService {

    List<Book> getAllBooks();

    Book getBookInfo(String bookId);
}
