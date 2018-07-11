package manhnv.web.manhnv.cqrs.sample.service.impl;

import manhnv.web.manhnv.cqrs.sample.entity.Book;
import manhnv.web.manhnv.cqrs.sample.service.IBookCommandService;
import manhnv.web.manhnv.cqrs.sample.util.BookUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookCommandServiceImpl implements IBookCommandService {

    @Override
    public void create(String name, Date publishDate) {
        //handle save process...
        int id = BookUtils.BOOK_LIST.size();
        BookUtils.BOOK_LIST.add(new Book(String.valueOf(id), name, publishDate));
    }
}
