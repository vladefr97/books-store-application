package com.vladefr97.services;


import com.vladefr97.dao.BookDao;
import com.vladefr97.models.Book;
import com.vladefr97.models.User;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class representing simple Book service
 */
@ManagedBean(name = "bookService")
@ApplicationScoped
public class BookService {
    private BookDao bookDao = new BookDao();

    /**
     * @param book - Book which need to be saved in Database
     */
    public void saveBook(Book book) {
        bookDao.save(book);
    }

    /**
     * @param book - Book which need to be updated in Database
     */
    public void updateBook(Book book) {
        bookDao.update(book);
    }

    /**
     * @param book - Book which need to be deleted from Database
     */
    public void deleteBook(Book book){
        bookDao.delete(book);
    }

    /**
     * @return - Return list of all books in Database
     */
    public List<Book> findAllBooks() {
        return bookDao.findAll();
    }


    /**
     * @param userId - id of the book user
     * @param startDate - Start date for the search
     * @param endDate - End date for the search
     * @return - Return list of found books
     */
    public List<Book> findByUserIdWithDates(int userId, Date startDate, Date endDate){

        return bookDao.findSpecifiedBooks(userId,startDate,endDate);
    }

}


