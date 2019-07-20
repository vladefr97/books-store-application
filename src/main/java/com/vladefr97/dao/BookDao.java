package com.vladefr97.dao;

import com.vladefr97.models.Book;
import com.vladefr97.models.User;
import com.vladefr97.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Data Access Object Class for Book
 */
public class BookDao {

    /**
     * @param book - Book object to save
     */
    public void save(Book book) {

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(book);
        tx1.commit();
        session.close();
    }

    /**
     * @param book - Book object to update
     */
    public void update(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(book);
        tx1.commit();
        session.close();
    }

    /**
     * @param book - Book object to delete
     */
    public void delete(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(book);
        tx1.commit();
        session.close();
    }

    /**
     * @param id - User id which need to be found
     * @return - User object
     */
    public User findById(int id) {
        return (User) HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .get(Book.class, id);
    }

    /**
     * @return - List of all users
     */
    public List<Book> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Book> books = (List<Book>) session.createQuery("FROM Book").list();
        session.close();
        return books;
    }

    /**
     * @param userId - id of the book user
     * @param startDate -  Start date for the search
     * @param endDate - End date for the search
     * @return - Found books
     */
    public List<Book> findSpecifiedBooks(int userId, Date startDate, Date endDate) {

        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String startSQLDate = sdf.format(startDate);
        String endSQLDate = sdf.format(endDate);


        String queryStr = "FROM Book Where user = " + userId + " AND date between '" + startSQLDate + "' AND '" + endSQLDate + "'";
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Book> books = (List<Book>) session.createQuery(queryStr).list();
        session.close();
        return books;


    }


}
