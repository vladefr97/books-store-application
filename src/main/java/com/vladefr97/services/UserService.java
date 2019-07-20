package com.vladefr97.services;

import com.vladefr97.models.User;
import com.vladefr97.dao.UserDao;
import com.vladefr97.models.Book;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.List;

/**
 * Class representing simple User service
 */
@ManagedBean(name = "userService")
@ApplicationScoped
public class UserService {
    private UserDao usersDao = new UserDao();

    public UserService() {

    }

    /**
     * @param id - id of the user which need to be found
     * @return - Found User
     */
    public User findUser(int id) {
        return usersDao.findById(id);
    }

    /**
     * @param user - User which need to be saved in Database
     */
    public void saveUser(User user) {
        usersDao.save(user);
    }

    /**
     * @param user - User which need to delete from Database
     */
    public void deleteUser(User user) {
        usersDao.delete(user);
    }

    /**
     * @param user  - User which need to be updated in database
     */
    public void updateUser(User user) {
        usersDao.update(user);
    }

    /**
     * @param fio - User's surname, name and patronymic
     * @return - Found User
     */
    public List<User> findUserByFIO(String fio){
        return usersDao.findUserByFIO(fio);
    }

    /**
     * @return - Return List of all users in Database
     */
    public List<User> findAllUsers() {
        return usersDao.findAll();
    }

    /**
     * @param id - id of book user
     * @return - Return List of found books
     */
    public List<Book> findBooksById(int id) {
        return usersDao.findBooksById(id);
    }



}
