package service;

import java.util.List;


import model.Book;
import utils.ReturnInfo;

public interface book_service {
	public ReturnInfo select(String txt,Integer page,Integer limit);
	public int count(String txt);
	public Book selectByid(int id);
	public void insert(Book b);
	public void update(Book b);
	public void delete(int id);
}
