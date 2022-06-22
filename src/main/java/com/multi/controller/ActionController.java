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
@RequestMapping("/action")
public class ActionController {

	
	@RequestMapping("/rougue")
	public String rougue(Model m) {
		m.addAttribute("center", "rougue");
		return "/index";
	}
	
	@RequestMapping("/castlevania")
	public String castlevania(Model m) {
		m.addAttribute("center", "castlevania");
		return "/index";
	}

	
}
