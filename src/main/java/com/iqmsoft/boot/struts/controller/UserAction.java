package com.iqmsoft.boot.struts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.struts.model.User;
import com.iqmsoft.boot.struts.service.ServiceFacade;
import com.opensymphony.xwork2.ActionSupport;

@Component
public class UserAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private List<User> users;

    @Autowired
    private ServiceFacade userService;

    public String execute() throws Exception {
        users = userService.retrieveUsers();
        return SUCCESS;
    }

    public List<User> getUsers() {
        return users;
    }
}
