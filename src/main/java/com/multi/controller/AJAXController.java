package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.ProductBiz;
import com.multi.biz.UserBiz;
import com.multi.vo.ProductVO;
import com.multi.vo.UserVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 21.
 * @version 1.0
 * @description
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 21.		qwaszx357		   First Creation
 *
 * =========================================================
 */
@RestController
public class AJAXController {

	@Autowired
	UserBiz ubiz;
	
	@Autowired
	ProductBiz pbiz;
	
	// ID 중복 확인
	@RequestMapping("/checkid")
	public String checkid(String id) {
		String result = "";
		UserVO user = null;
		
		if (id.equals("") || id == null) {
			return "1";
		}
		try {
			user = ubiz.getid(id);
			if (user == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
