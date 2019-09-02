package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.type_dao;
import model.Type;
import service.type_service;
@Service
public class type_service_impl implements type_service{
	@Autowired
    type_dao td;
	public List<Type> select(String txt) {		
		return td.select(txt);
	}
	
	public void insert(Type t) {
		td.insert(t);	
	}
	public void update(Type t) {
		td.update(t);		
	}
	public void delete(int id) {		
		td.delete(id);
	}

	public Type selectByid(int id) {
		
		return td.selectByid(id);
	}

}
