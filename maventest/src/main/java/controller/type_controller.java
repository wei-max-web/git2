package controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import model.Type;

import service.type_service;

@Controller
public class type_controller {
	@Autowired//在容器中根据类型自动注入
	type_service ts;
	
	
	@RequestMapping("typeindex")	
	public String select(String txt,ModelMap m) {
		if(txt==null||txt.equals(""))
			txt="";
		else txt="where name like '%"+txt+"%'";
		m.put("list", ts.select(txt));
		return "typeindex";
	}
	@RequestMapping("addt")
	public String  add(ModelMap m) {
		return "typeedit";
	}
	
	@RequestMapping("editt")
	public String  edit(int id,ModelMap m) {
		m.put("info", ts.selectByid(id));
		return add(m);
	}
	@RequestMapping("insertt")	
	public String insert(Type t,ModelMap m) {
		ts.insert(t);
		return select(null,m);
	}
	@RequestMapping("updatet")	
	public String update(Type t,ModelMap m) {	
		ts.update(t);
		return select(null,m);
	}
	@RequestMapping("deletet")	
	public String delete(int id,ModelMap m) {
		ts.delete(id);
		return select(null,m);
	}
}
