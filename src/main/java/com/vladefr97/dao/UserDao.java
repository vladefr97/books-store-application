package com.vladefr97.dao;

import com.vladefr97.models.Book;
import com.vladefr97.models.User;
import com.vladefr97.utils.HibernateSessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

/**
 * Data Access Object Class for User
 */
public class UserDao {

    /**
     * @param user - User object to save
     */
    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    /**
     * @param user - User object to update
     */
    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    /**
     * @param user - User object to delete
     */
    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    /**
     * @param id - id of the user which need to be found
     * @return - Found User
     */
    public User findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }


    /**
     * @param id - id for books user
     * @return - Found books
     */
    public List<Book> findBooksById(int id) {

        String queryStr = "FROM Book Where user = " + id;
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Book> books = (List<Book>) session
                .createQuery(queryStr).list();
        session.close();
        return books;
    }


    /**
     * @return - List of all users
     */
    public List<User> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        List<User> users = (List<User>) session
                .createQuery("FROM User").list();
        session.close();
        return users;
    }

    /**
     * @param fio - User's surname, name and patronymic
     * @return - Found user
     */
    public List<User> findUserByFIO(String fio) {
        String queryStr = "FROM User Where fio = '" + fio + "'";
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<User> users = (List<User>) session.createQuery(queryStr).list();
        session.close();
        return users;

    }
}
