package com.iqmsoft.boot.struts.service;


import java.util.List;

import com.iqmsoft.boot.struts.model.User;

public interface ServiceFacade {
    void putUsers();
    List<User> retrieveUsers();
}