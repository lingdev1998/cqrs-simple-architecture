package manhnv.web.manhnv.cqrs.sample.controller;

import manhnv.web.manhnv.cqrs.sample.representation.BookCreateCommandDto;
import manhnv.web.manhnv.cqrs.sample.service.IBookCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class BookCommandController {

    @Autowired
    private IBookCommandService bookCommandService;

    @PostMapping("/book/create")
    @ResponseStatus(HttpStatus.OK)
    public void createBook(@RequestBody BookCreateCommandDto dto) {
        bookCommandService.create(dto.getName(), dto.getPublishDate());
    }
}
