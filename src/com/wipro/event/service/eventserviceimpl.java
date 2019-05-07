package com.wipro.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.event.model.login;

@Service
public class eventserviceimpl implements eventservice {
	@Autowired
	private com.wipro.event.dao.eventdao   eventdao;
	@Override
public String dologin(String username,String password)
{
		return eventdao.dologin(username,password);
}
	@Override
	public String  doregister(login login)
	{
		return eventdao.doregister(login);
	}
}
