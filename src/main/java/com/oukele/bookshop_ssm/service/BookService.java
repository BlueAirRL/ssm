package com.oukele.bookshop_ssm.service;

import com.oukele.bookshop_ssm.dao.IBookDao;
import com.oukele.bookshop_ssm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    List<Book> listAll();
}

