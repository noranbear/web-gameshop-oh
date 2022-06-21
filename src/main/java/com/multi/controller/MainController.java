package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author noranbear
 * @date 2022. 6. 21.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 21.		noranbear		   First Creation
 *
 * =========================================================
 */
@Controller
public class MainController {

	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {
		m.addAttribute("center", "login");
		return "/index";
	}
	
	@RequestMapping("/signup")
	public String signup(Model m) {
		m.addAttribute("center", "signup");
		return "/index";
	}
	
	@RequestMapping("/category")
	public String category(Model m) {
		m.addAttribute("center", "category");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m) {
		m.addAttribute("center", "detail");
		return "/index";
	}
}
