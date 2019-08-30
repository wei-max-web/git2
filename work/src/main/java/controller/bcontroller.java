package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import entity.Book;
import service.bService;

@Controller
public class bcontroller {
	@Autowired
	bService ser;
	@RequestMapping("index")
	public String aa(@RequestParam(defaultValue="",required=false) String name,ModelMap m){
		String	txt="";
		if(name!="") {
		 	txt=" where book.name like '%"+name+"%'";
		}
		m.put("list", ser.select(txt));
		return "index";
	}
	@RequestMapping("delete")
	public String delete(int id,ModelMap m) {
		ser.delete(id);
		return aa("",m);
	}
	@RequestMapping("insert")
	public String insert(Book b,ModelMap m) {
		ser.insert(b);
		return aa("",m);
	}
	@RequestMapping("edit")
	public String edit(int id,ModelMap m) {
		String txts=" where book.id= "+id;
		m.put("list1", ser.select(txts));
		return "edit";
	}
	@RequestMapping("update")
	public String update(Book b,ModelMap m) {
		ser.update(b);
		return aa("",m);
	}
}
