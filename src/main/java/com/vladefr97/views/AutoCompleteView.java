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
                String res = userFio.replaceFirst(query, "");
                results.add(userFio);
            }
        }

        return results;
    }


    public void onItemSelect(SelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item Selected", event.getObject().toString()));


    }


}