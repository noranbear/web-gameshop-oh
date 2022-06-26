package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 22.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 22.		qwaszx357		   First Creation
 *
 * =========================================================
 */
@Controller
public class ActionController {
	
	@Autowired
	ProductBiz pbiz;

	@RequestMapping("/action")
	public String action(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;		
		try {
			list = pbiz.getaction();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);		
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "action");
		return "/index";
	}

	@RequestMapping("/action1")
	public String action1(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getaction1();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "action1");
		return "/index";
	}
	
	@RequestMapping("/action2")
	public String action2(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getaction2();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "action2");
		return "/index";
	}
	
	@RequestMapping("/action3")
	public String action3(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getaction3();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "action3");
		return "/index";
	}
	


}
