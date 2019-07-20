package com.vladefr97.views;

import com.vladefr97.models.User;
import com.vladefr97.services.UserService;
import org.primefaces.event.SelectEvent;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class AutoCompleteView {

    private String txt1;
    private String txt2;
    private String txt3;
    private String txt4;
    private String txt5;
    private String txt6;
    private String txt7;
    private String txt8;


    private List<User> users;
    @ManagedProperty("#{userService}")
    private UserService service;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }

    @PostConstruct
    public void init() {
        users = service.findAllUsers();
    }

    public List<String> completeText(String query) {
        List<String> results = new ArrayList<String>();
        for (int i = 0; i < users.size(); i++) {
            String userFio = users.get(i).getFio();
            int index = userFio.indexOf(query);
            if (index != -1) {
//                String res = userFio.replaceFirst(query, "");
                results.add(userFio);
            }
        }

        return results;
    }


    public void onItemSelect(SelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item Selected", event.getObject().toString()));


    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }

    public String getTxt4() {
        return txt4;
    }

    public void setTxt4(String txt4) {
        this.txt4 = txt4;
    }

    public String getTxt5() {
        return txt5;
    }

    public void setTxt5(String txt5) {
        this.txt5 = txt5;
    }

    public String getTxt6() {
        return txt6;
    }

    public void setTxt6(String txt6) {
        this.txt6 = txt6;
    }

    public String getTxt7() {
        return txt7;
    }

    public void setTxt7(String txt7) {
        this.txt7 = txt7;
    }

    public String getTxt8() {

        System.out.println(txt8);
        return txt8;
    }

    public void setTxt8(String txt8) {
        this.txt8 = txt8;
    }


}