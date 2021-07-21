package com.codingdojo.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Process {

	@RequestMapping(value="/getGold", method=RequestMethod.POST)
	public String getGold(@RequestParam(value="button")String button, HttpSession session) {
		if(button.equals("farm")) {
			
			String format = "EEEEE dd yyyy KK:mm aa";
			SimpleDateFormat dateFormat= new SimpleDateFormat(format);			
			int goldGenerate = ThreadLocalRandom.current().nextInt(10,21);
			String timeStamp = dateFormat.format(new Date());
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
			list.add(0,"<p class=greentext> You entered a Farm and earned "+goldGenerate+" gold. ("+timeStamp+")</p>");
			session.setAttribute("gold", (int)session.getAttribute("gold")+goldGenerate);
			session.setAttribute("logList", list);
						
		}
		
		if(button.equals("cave")) {
			
			String format = "EEEEE dd yyyy KK:mm aa";
			SimpleDateFormat dateFormat= new SimpleDateFormat(format);			
			int goldGenerate = ThreadLocalRandom.current().nextInt(5,11);
			String timeStamp = dateFormat.format(new Date());
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
			list.add(0,"<p class=greentext> You entered a Cave and earned "+goldGenerate+" gold. ("+timeStamp+")</p>");
			session.setAttribute("gold", (int)session.getAttribute("gold")+goldGenerate);
			session.setAttribute("logList", list);
				
		}
		
		if(button.equals("house")) {
			
			String format = "EEEEE dd yyyy KK:mm aa";
			SimpleDateFormat dateFormat= new SimpleDateFormat(format);			
			int goldGenerate = ThreadLocalRandom.current().nextInt(2,6);
			String timeStamp = dateFormat.format(new Date());
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
			list.add(0,"<p class=greentext> You entered a House and earned "+goldGenerate+" gold.("+timeStamp+")</p>");
			session.setAttribute("gold", (int)session.getAttribute("gold")+goldGenerate);
			session.setAttribute("logList", list);
						
		}
		
		if(button.equals("casino")) {
			
			int val = ThreadLocalRandom.current().nextInt(1,3);
			String format = "EEEEE dd yyyy KK:mm aa";
			SimpleDateFormat dateFormat= new SimpleDateFormat(format);
			
			if(val == 1) {
				int goldGenerate = ThreadLocalRandom.current().nextInt(0,51);
				String timeStamp = dateFormat.format(new Date());
				ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
				list.add(0,"<p class=greentext> You entered a Casino and earned "+goldGenerate+" gold. ("+timeStamp+")</p>");
				session.setAttribute("gold", (int)session.getAttribute("gold")+goldGenerate);
				session.setAttribute("logList", list);
				
			}
			
			if(val == 2) {
				int goldGenerate = ThreadLocalRandom.current().nextInt(0,51);
				String timeStamp = dateFormat.format(new Date());
				ArrayList<String> list = (ArrayList<String>) session.getAttribute("eventLog");
				list.add(0,"<p class=redtext> You entered a Casino and lost "+goldGenerate+" gold. Ouch. ("+timeStamp+")</p>");
				session.setAttribute("gold", (int)session.getAttribute("gold")-goldGenerate);
				session.setAttribute("logList", list);				
			}			
		}		
		return"redirect:/Gold";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/Gold";
	}	
}
