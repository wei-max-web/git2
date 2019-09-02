package service;

import java.util.List;

import model.Type;

public interface type_service {
	public List<Type> select(String txt);
	public Type selectByid(int id);
	public void insert(Type t);
	public void update(Type t);
	public void delete(int id);
}
