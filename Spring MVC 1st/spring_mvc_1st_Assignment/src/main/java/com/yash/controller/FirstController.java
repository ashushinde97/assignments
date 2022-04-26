package com.yash.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

	 @RequestMapping(value="/m1")
	 public String show()
	 {
		// System.out.println("hello namdev and nilesh");
		 return "index";// controller return the name of view page which need to be shown
	 }
	 
	 @RequestMapping("/m2")
	 public String redirect()
	 {		 
		 return "show";
	 }
	 @RequestMapping("/m3")
	 public String disp()
	 {
		 return "final";
	 }
	 @RequestMapping("/modeldemo")
	 public String viewData(@RequestParam("un") String username,@RequestParam("pass") String password, Model m)
	 {
		 if(username.equals("admin") && password.equals("Tes54!@"))
		 { 
			 m.addAttribute("unname", username);			 
			 return "viewpage";
		 }
		 else
		 {			 
			 m.addAttribute("errmsg", "Login fails");
			 return "errorpage";
		 }
	 }
	 @RequestMapping("/getParaSubmit")
	 public String getPSubmit(HttpServletRequest req,Model m )
	 {
		 String un = req.getParameter("unp");
		 String pass = req.getParameter("passp");
		 m.addAttribute("un", un);
		 return "getdemopage";
	 }
	 @RequestMapping(value="/postSubmit", method=RequestMethod.POST)
	 public String postSubmit(String unpost,String passpost, Model m)
	 {
		 m.addAttribute("un",unpost);
		 m.addAttribute("msg", "data is hidden");
		 return "postpage";
	 }
}
