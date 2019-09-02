package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.book_dao;
import model.Book;
import service.book_service;
import utils.ReturnInfo;
@Service
public class book_service_impl implements book_service{
	@Autowired
    book_dao td;
	public ReturnInfo select(String txt,Integer page,Integer limit) {
		if(txt==null||txt.length()==0) txt="";
		else txt="where book.name like '%"+txt+"%'";
		ReturnInfo info = new ReturnInfo();
		String limitstr="";
		if(page!=null) {
			limitstr="limit "+((page-1)*limit)+","+limit;
			info.setCount(count(txt));
		}
		info.setList(td.select(txt,limitstr));
		return info;
	}
	public int count(String txt) {
		return td.count(txt);
	}
	public Book selectByid(int id) {
		return td.selectByid(id);
	}
	public void insert(Book t) {
		td.insert(t);	
	}
	public void update(Book t) {
		td.update(t);		
	}
	public void delete(int id) {		
		td.delete(id);
	}
	
	
	
	
}
