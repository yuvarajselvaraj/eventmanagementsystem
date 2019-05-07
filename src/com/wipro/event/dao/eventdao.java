package com.wipro.event.dao;

import com.wipro.event.model.login;

public interface eventdao {
public String dologin(String username,String password);
public String doregister(login login) ;
}
