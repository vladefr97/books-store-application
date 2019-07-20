package com.vladefr97.dao;

import com.vladefr97.models.Book;
import com.vladefr97.models.User;
import com.vladefr97.utils.HibernateSessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.util.List;

public class UserDao {

    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public User findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        User user = (User) session.get(User.class, id);
        session.close();
        return user;
    }


    public List<Book> findBooksById(int id) {

        String queryStr = "FROM Book Where user = " + id;
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Book> books = (List<Book>) session
                .createQuery(queryStr).list();
        session.close();
        return books;
    }


    public List<User> findAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        List<User> users = (List<User>) session
                .createQuery("FROM User").list();
        session.close();
        return users;
    }

    public List<User> findUserByFIO(String fio) {
        String queryStr = "FROM User Where fio = '" + fio + "'";
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<User> users = (List<User>) session.createQuery(queryStr).list();
        session.close();
        return users;

    }
}
