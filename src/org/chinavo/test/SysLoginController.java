package org.chinavo.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SysLoginController {

	@RequestMapping(value = "/hello")
	public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
		// 如果已经登录，则跳转到管理首页
	 
		return "/login";
	}
}
