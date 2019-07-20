package com.vladefr97.services;

import com.vladefr97.models.User;
import com.vladefr97.dao.UserDao;
import com.vladefr97.models.Book;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean(name = "userService")
@ApplicationScoped
public class UserService {
    private UserDao usersDao = new UserDao();

    public UserService() {

    }

    public User findUser(int id) {
        return usersDao.findById(id);
    }

    public void saveUser(User user) {
        usersDao.save(user);
    }

    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    public void updateUser(User user) {
        usersDao.update(user);
    }

    public List<User> findUserByFIO(String fio){
        return usersDao.findUserByFIO(fio);
    }

    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    public List<Book> findBooksById(int id) {
        return usersDao.findBooksById(id);
    }



}
