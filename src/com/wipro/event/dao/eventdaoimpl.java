package com.wipro.event.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.event.model.login;

@Repository
public class eventdaoimpl implements eventdao {
@Autowired
private SessionFactory sessionfactory;
@Transactional
@Override
public String dologin(String useranme,String password)
{
	login login=(com.wipro.event.model.login) sessionfactory.getCurrentSession().get(login.class, useranme);
	if(login.getPassword()==password)
	{
		return "index1";
	}
	return    null;
}
@Transactional
@Override
public String doregister(login login)
{
sessionfactory.getCurrentSession().save(login);	
return "index";
}
}
