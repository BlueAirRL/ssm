package com.oukele.bookshop_ssm.dao;

import com.oukele.bookshop_ssm.entity.Book;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IBookDao {
    List<Book> listAll();
}