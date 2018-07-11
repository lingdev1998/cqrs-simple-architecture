package manhnv.web.manhnv.cqrs.sample.service.impl;

import manhnv.web.manhnv.cqrs.sample.entity.Book;
import manhnv.web.manhnv.cqrs.sample.service.IBookQueryService;
import manhnv.web.manhnv.cqrs.sample.util.BookUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookQueryServiceImpl implements IBookQueryService {

    @Override
    public List<Book> getAllBooks() {
        return BookUtils.BOOK_LIST;
    }

    @Override
    public Book getBookInfo(String bookId) {
        Optional<Book> optional = BookUtils.BOOK_LIST.stream()
                .filter(book -> Objects.equals(book.getId(), bookId))
                .findFirst();
        return optional.orElse(null);
    }
}
