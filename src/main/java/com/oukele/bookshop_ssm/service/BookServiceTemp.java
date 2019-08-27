package com.oukele.bookshop_ssm.service;

import com.oukele.bookshop_ssm.dao.IBookDao;
import com.oukele.bookshop_ssm.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceTemp implements BookService {

    //    使用 dao 中的接口
    @Autowired
    private IBookDao bookDao;

    @Override
    public List<Book> listAll() {
        return bookDao.listAll();
    }
}