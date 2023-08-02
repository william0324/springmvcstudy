package org.example.service.impl;

import org.example.controller.Code;
import org.example.exception.BusinessException;
import org.example.mapper.BookMapper;
import org.example.pojo.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public boolean save(Book book) {
        bookMapper.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookMapper.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookMapper.delete(id);
        return true;
    }

    @Override
    public Book getById(Integer id) {
        if (id < 0) {
            throw new BusinessException(Code.BUSINESS_ERR,"请勿进行非法操作!!");
        }
        //将可能的异常包装，转换成自定义异常
//        try {
//            int i = 1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_ERR,"服务器访问超时！！",e);
//        }
       return bookMapper.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
