/**
 * 
 */
package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SingleController {

	@RequestMapping("/register")
	public String register()
	{
		
		return "register";
	}

	@RequestMapping(value="registercust", method=RequestMethod.GET)
	public String register(Model m,@RequestParam("name") String name,@RequestParam("mobile") String mob,@RequestParam("email") String email)
	{
		m.addAttribute("name",name);
		m.addAttribute("mob",mob);
		m.addAttribute("email",email);
		
		return "success";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}

	@RequestMapping(value="loginobj", method=RequestMethod.POST)
	public String login(Model m,@RequestParam("username") String uname,@RequestParam("password") String pass)
	{
		if(uname.equals("admin") && pass.equals("admin"))
		{
			m.addAttribute("uname",uname);
			m.addAttribute("pass",pass);
			
			return "success";
		}
		else
		{
			m.addAttribute("uname",uname);
			m.addAttribute("pass",pass);
			
			return "error";
		}
		
	}
	
	@RequestMapping("/viewall")
	public String viewall()
	{
		return "viewall";
	}

}
