package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	@RequestMapping("index")
	public String aa(ModelMap m) {
		m.put("info", "asdasdsad");
		return "index";
	}

}
