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
public class SportsController {
	
	@Autowired
	ProductBiz pbiz;

	@RequestMapping("/sports")
	public String sports(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getsports();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "sports");
		return "/index";
	}
	
	@RequestMapping("/sports1")
	public String sports1(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getsports1();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "sports1");
		return "/index";
	}
	
	@RequestMapping("/sports2")
	public String sports2(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getsports2();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "sports2");
		return "/index";
	}

	@RequestMapping("/sports3")
	public String sports3(Model m) {
		List<ProductVO> list = null;
		List<ProductVO> nlist = null;
		try {
			list = pbiz.getsports3();
			m.addAttribute("plist", list);
			nlist = pbiz.newgame();
			m.addAttribute("nplist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "sports3");
		return "/index";
	}

}
