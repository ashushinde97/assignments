package com.yash.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Item {

	@RequestMapping("/itemp")
	 public String itempage()
	 {
		
		 return "item";
	 }
	@RequestMapping("/itemSubmit")
	 public String ItemSubmit(HttpServletRequest req,Model m )
	 {
		 String itname = req.getParameter("itm");
		 String itprice = req.getParameter("price");
		 String itqt = req.getParameter("qt");
		 String itdis = req.getParameter("dis");
		
		int b = Integer.parseInt(itprice);
		int c = Integer.parseInt(itdis);
		int z = Integer.parseInt(itqt);
		int x= b*z;
		int d = (x * c) / 100;
		int discountprice= x-d;
		
		 m.addAttribute("itname", itname);
		 m.addAttribute("itprice", itprice);
		 m.addAttribute("itqt", itqt);
		 m.addAttribute("itdis", itdis);
		 m.addAttribute("itd", discountprice); 
		
		 return "display";
	 }

}
