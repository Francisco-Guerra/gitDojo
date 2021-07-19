package com.codingdojo.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
		
@Controller
public class CounterController {
	
	@RequestMapping("/")
	public String index(HttpSession session){
		
		if (session.isNew()) {
			session.setAttribute("counter", 0);
		}
		else {
			Integer count = (Integer) session.getAttribute("counter");
			count += 1;
			session.setAttribute("counter", count);
		}
		return "views/index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter() {
		return "views/counter.jsp";
	}
}