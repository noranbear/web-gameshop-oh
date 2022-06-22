package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author noranbear,najune
 * @date 2022. 6. 21.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 21.		noranbear		   First Creation
 *	2022. 6. 21			najune			   Controller 추
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
	
	@RequestMapping("/action")
	public String action(Model m) {
		m.addAttribute("center", "action");
		return "/index";
	}
	
	@RequestMapping("/rpg")
	public String rpg(Model m) {
		m.addAttribute("center", "rpg");
		return "/index";
	}
	
	@RequestMapping("/sports")
	public String sports(Model m) {
		m.addAttribute("center", "sports");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m) {
		m.addAttribute("center", "detail");
		return "/index";
	}
	
	@RequestMapping("/two")
	public String two(Model m) {
		m.addAttribute("center", "two");
		return "/index";
	}
	
	@RequestMapping("/three")
	public String three(Model m) {
		m.addAttribute("center", "three");
		return "/index";
	}
	
}
