package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Book;
import model.Type;
import service.book_service;
import service.type_service;
import utils.ReturnInfo;

@Controller

public class book_controller {

	@Autowired//在容器中根据类型自动注入
	book_service bs;
	@Autowired
	type_service ts;
	
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}
	
	//根据id查询
	//@RequestMapping(value = "/{txt}/{page}/{limit}",method = RequestMethod.GET)
	@RequestMapping("index2")	
	public @ResponseBody ReturnInfo index(String txt ,Integer page,Integer limit,ModelMap m){//使用Integer 担心page为空
		return bs.select(txt,page,limit);
	}
    
	
//	@RequestMapping("add")
//	public String  add(ModelMap m) {
//		
//		return "edit";
//	}
	
	@RequestMapping("edit/{id}")
	public @ResponseBody Book  edit(@PathVariable("id") int id,ModelMap m) {
		
		return bs.selectByid(id);
	}
	@RequestMapping("insert")	
	public @ResponseBody String insert(Book b,ModelMap m) {
		bs.insert(b);
		return "{\"status\":1}";
	}
	@RequestMapping("update")	
	public @ResponseBody String update(Book b,ModelMap m) {	
		bs.update(b);
		return "{\"status\":1}";
	}
	@RequestMapping("delete/{id}")	
	public @ResponseBody String delete(@PathVariable("id") int id,ModelMap m) {
		bs.delete(id);
		return "{\"status\":1}";
	}
	@RequestMapping("getSexs")
	public @ResponseBody String[] getSexs() {
		return Book.sexs;
	}
	
	@RequestMapping("getTypes")
	public @ResponseBody List<Type> getTypes() {
		return ts.select(null);
	}
	
}
