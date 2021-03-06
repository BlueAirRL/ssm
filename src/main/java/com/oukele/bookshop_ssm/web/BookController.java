package com.oukele.bookshop_ssm.web;

import com.oukele.bookshop_ssm.entity.Book;
import com.oukele.bookshop_ssm.service.BookServiceTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookServiceTemp bookServiceTemp;

//    请求url
    @RequestMapping(value = "/books")
    public ModelAndView getList(){
//        页面的名字
        ModelAndView mv = new ModelAndView("list");
//        获取数据
        List<Book> list = bookServiceTemp.listAll();
        mv.addObject("book",list);
        return mv;
    }

}