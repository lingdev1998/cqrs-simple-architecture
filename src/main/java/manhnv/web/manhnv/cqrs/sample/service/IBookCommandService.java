package manhnv.web.manhnv.cqrs.sample.service;

import java.util.Date;

public interface IBookCommandService {

    void create(String name, Date publishDate);

}
