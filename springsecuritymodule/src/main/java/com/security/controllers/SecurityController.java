package com.security.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SecurityController {

	
	 @RequestMapping(value="/",method=RequestMethod.GET)
	   public ModelAndView signup(HttpServletRequest request, HttpServletResponse response)
	   {
		 
	     LoginModel loginBean=new  LoginModel();
//	     loginBean.setPassword("aa");
//	     loginBean.setUsername("bb");
	     ModelAndView model = new ModelAndView("login");
	     model.addObject("loginBean", loginBean);
	     request.setAttribute("message", "Login ");
	     request.setAttribute("msg", " "); 

	     
	     return model;
	   }
	 
	 
	
	 
	 
	 
	 @RequestMapping(value = "login.action", method = RequestMethod.POST)
		public ModelAndView afterlogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 LoginModel loginBean=new  LoginModel();
		 ModelAndView model = new ModelAndView("login");
	     model.addObject("loginBean", loginBean);
	     request.setAttribute("message", "Login ");
	     request.setAttribute("msg", "invalid  security level "); 

	 return model;
	 }
	 
	
	 @RequestMapping(value = "loginspringsecurity.action", method = RequestMethod.GET)
		public String afterspringsecurity(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {

			
						return "userdash";
						
					}
					
					
					

				// in case id error when username and password does not matches 
	 
	 
	 
	 
	 @RequestMapping(value = "accessDenied.action", method = RequestMethod.GET)
		public ModelAndView accessdenied(HttpServletRequest request, HttpServletResponse response) throws Exception {

		 
		 
		 
		 LoginModel loginBean=new  LoginModel();
		 ModelAndView model = new ModelAndView("login");
	     model.addObject("loginBean", loginBean);
	     request.setAttribute("message", "Login ");
	     request.setAttribute("msg", "invalid  security level "); 

	 return model;
	 }
		 
		 
			
						
					}
	
	 
	 



