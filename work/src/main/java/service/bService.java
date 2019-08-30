package service;

import java.util.List;

import entity.Book;

public interface bService {
	public List<Book> select(String txt);
	public void delete(int id);
	public void insert(Book b);
	public void update(Book b);

}
