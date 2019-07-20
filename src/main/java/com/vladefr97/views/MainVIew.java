package com.vladefr97.views;

import com.vladefr97.models.Book;
import com.vladefr97.models.User;
import com.vladefr97.services.BookService;
import com.vladefr97.services.UserService;
import org.primefaces.event.RowEditEvent;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

@ManagedBean(name = "mainView")
@ViewScoped
public class MainVIew implements Serializable {


    private List<Book> books;
    private String fioText;
    private Date startDate;
    private Date endDate;
    @ManagedProperty("#{bookService}")
    private BookService bookService;
    @ManagedProperty("#{userService}")
    private UserService userService;

    @PostConstruct
    public void init() {

        books = bookService.findAllBooks();
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFioText() {
        return fioText;
    }

    public void setFioText(String fioText) {
        this.fioText = fioText;
    }

    public BookService getBookService() {
        return bookService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<Book> getBooks() {
        return books;
    }


    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public void onRowEdit(RowEditEvent event) {
        try {
            Book book = ((Book) event.getObject());
            SimpleDateFormat sdf =
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


            bookService.updateBook(book);
            FacesMessage msg = new FacesMessage("Данные измнены ", book.getTitle());
            FacesContext.getCurrentInstance().addMessage("", msg);
        } catch (Exception e) {
            FacesMessage msg = new FacesMessage("Не удалось выполнить действие", "");
            FacesContext.getCurrentInstance().addMessage("", msg);
            onRowCancel(event);
        }
    }

    public void onRowCancel(RowEditEvent event) {

        FacesMessage msg = new FacesMessage("Изменения отменены", ((Book) event.getObject()).getTitle());
        FacesContext.getCurrentInstance().addMessage("", msg);
    }

    public void onFindBtn() {
        books = findUserBooks(fioText, startDate, endDate);
    }

    private List<Book> findUserBooks(String userFIO, Date startDate, Date endDate) {

        List<User> users =  userService.findUserByFIO(fioText);
        int userId = users
                .get(0).getId();
        return bookService.findByUserIdWithDates(userId, startDate, endDate);


    }


}