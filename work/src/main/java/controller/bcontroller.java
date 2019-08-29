package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
