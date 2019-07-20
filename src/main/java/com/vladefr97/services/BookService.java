package com.vladefr97.services;


import com.vladefr97.dao.BookDao;
import com.vladefr97.models.Book;
import com.vladefr97.models.User;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(name = "bookService")
@ApplicationScoped
public class BookService {
    private BookDao bookDao = new BookDao();

    public void saveBook(Book book) {
        bookDao.save(book);
    }
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    public List<Book> findAllBooks() {
        return bookDao.findAll();
    }


    public List<Book> findByUserIdWithDates(int userId, Date startDate, Date endDate){

        return bookDao.findSpecifiedBooks(userId,startDate,endDate);
    }
    public List<String> getAllTitles() {
        List<Book> books = findAllBooks();
        List<String> titles = new ArrayList<>();
        for (Book book : books)
            titles.add(book.getTitle());
        return titles;
    }
}


