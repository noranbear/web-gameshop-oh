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
 * @date 2022. 6. 24.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 24.		qwaszx357		   First Creation
 *
 * =========================================================
 */
@Controller
public class RpgController {
	
	@Autowired
	ProductBiz pbiz;

	@RequestMapping("/rpg")
	public String rpg(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getrpg();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "rpg");
		return "/index";
	}
	
	@RequestMapping("/rpg1")
	public String rpg1(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getrpg1();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "rpg1");
		return "/index";
	}
	
	@RequestMapping("/rpg2")
	public String rpg2(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getrpg2();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "rpg2");
		return "/index";
	}

	@RequestMapping("/rpg3")
	public String rpg3(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getrpg3();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "rpg3");
		return "/index";
	}

}
