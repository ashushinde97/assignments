package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
  @RequestMapping("/userhome")
  public String uh()
  {
	  return "userhome";	  
  }

  @GetMapping("/userreg")
  public String userRegistrationForm(Model m)
  {	  
	  User objU = new User();
	  m.addAttribute("obju", objU);
	return "usersignup"; 
  }
  @PostMapping("/usersbt")
  public String saveUser(@ModelAttribute("obju") User objuser, Model m)
  {  
	  m.addAttribute("objUser", objuser);	  
	  return "user_saved";
  }
}