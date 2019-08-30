package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.bDao;
import entity.Book;
import service.bService;

@Service
public class impl implements bService {
	@Autowired
	bDao dao;

	public List<Book> select(String txt) {	
		return dao.select(txt);
	}

	public void delete(int id) {
		 dao.delete(id);
		
	}

	public void insert(Book b) {
		dao.insert(b);
		
	}

	public void update(Book b) {
		dao.update(b);
		
	}


}
