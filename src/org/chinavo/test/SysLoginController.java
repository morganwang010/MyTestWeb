package org.chinavo.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.chinavo.test.form.LoginForm;
import org.chinavo.test.form.RegistForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller


public class SysLoginController {

	
	@ModelAttribute("loginForm")
	public LoginForm createModel() {
	    return new LoginForm();
	}
	
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login(@ModelAttribute(value = "loginForm") @Valid LoginForm loginForm, Model model) {
		// 如果已经登录，则跳转到管理首页
	 model.addAttribute("loginForm", createModel());
		return "/login";
	}
	
	
	@RequestMapping(value = "/regist")
	public String regist(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 如果已经登录，则跳转到管理首页
	 model.addAttribute("registration", new RegistForm());
		return "/registration";
	}
	
	@RequestMapping(method = RequestMethod.POST,value={"/authenticate"})
	public String login(@ModelAttribute(value = "loginForm") @Valid LoginForm loginForm, BindingResult result, Model model)
	{
		return "/login";
	}
	
	@RequestMapping(method = RequestMethod.POST,value={"/register"})
	public String regist(@ModelAttribute(value = "registration") @Valid RegistForm registration, BindingResult result, Model model)
	{
		return "/registration";
	}
	
	
}
