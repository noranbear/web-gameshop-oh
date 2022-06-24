package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.ProductBiz;
import com.multi.biz.UserBiz;
import com.multi.vo.UserVO;

/**
 * @author noranbear
 * @date 2022. 6. 21.
 * @version 1.0
 * @description
 *
 *
 * ====================================================================
 * 	    DATE			 AUTHOR				        NOTE
 * --------------------------------------------------------------------
 *  2022. 6. 21.		noranbear		        First Creation
 *									     Adding box controller methods
 *  2022. 6. 21.		qwaszx357		   		loginlmpl add
 *  2022. 6. 21.		        		   		signuplmpl add
 *
 * ====================================================================
 */
@Controller
public class MainController {

	@Autowired
	UserBiz ubiz;
	
	@Autowired
	ProductBiz pbiz;
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	
    /*
    * login
    */
	@RequestMapping("/login")
	public String login(Model m, String msg) {
		if(msg != null && msg.equals("f")) {
			m.addAttribute("msg", "ID 혹은 PWD가 틀렸습니다.");
		}
		m.addAttribute("center", "login");
		return "/index";
	}

	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd, HttpSession session) {
		UserVO user = null;
		try {
			user = ubiz.getid(id);
			if (user != null) {
				if (user.getPwd().equals(pwd)) {
					session.setAttribute("loginuser", user);
				}else {
					throw new Exception();
				}
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			return "redirect:/login?msg=f";
		}
		return "/index";
	}
	
	@RequestMapping("/msg")
	public String msg(Model m) {
		return "msg";
	}
	
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		return "/index";
	}
	
	
	/*
	* signup
    */
	@RequestMapping("/signup")
	public String signup(Model m) {
		m.addAttribute("center", "signup");
		return "/index";
	}

	@RequestMapping("/signupimpl")
	public String signupimpl(Model m, UserVO user, HttpSession session) {
		if (user.getId().equals("") || user.getId() == null) {
			return "redirect:/signup?msg=f";
		}
		if (user.getPwd().equals("") || user.getPwd() == null) {
			return "redirect:/signup?msg=f";
		}
		try {
			ubiz.register(user);
			session.setAttribute("loginuser", user);
			System.out.println(user);
		} catch (Exception e) {
			return "redirect:/signup";
		}
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
	
	
	/*
	 * profile
	 */
	@RequestMapping("/profile")
	public String profile(Model m) {
		m.addAttribute("center", "profile");
		return "/index";
	}
	
	
	/*
	 * box
	 */
	@RequestMapping("/bmain")
	public String bmain(Model m) {
		m.addAttribute("center", "bmain");
		return "/index";
	}
	
	@RequestMapping("/wishlist")
	public String wishlist(Model m) {
		m.addAttribute("center", "bmain");
		m.addAttribute("bcenter", "wishlist");
		return "/index";
	}
	
	@RequestMapping("/allgame")
	public String allgame(Model m) {
		m.addAttribute("center", "bmain");
		m.addAttribute("bcenter", "allgame");
		return "/index";
	}

}
	
