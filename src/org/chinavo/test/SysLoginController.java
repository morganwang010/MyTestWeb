package org.chinavo.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.chinavo.test.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SysLoginController {

	@RequestMapping(value = "/hello")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 如果已经登录，则跳转到管理首页
	 model.addAttribute("loginForm", new LoginForm());
		return "/login";
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value={"/authenticate"})
	public String regist(@ModelAttribute(value = "loginForm") @Valid LoginForm loginForm, BindingResult result, Model model)
	{
		return "/login";
	}
}
