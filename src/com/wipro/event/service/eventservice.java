package com.wipro.event.service;

import com.wipro.event.model.login;

public interface eventservice {
public String dologin(String username,String password);
public String doregister(login login);
}
