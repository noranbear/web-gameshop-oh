package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.BoxBiz;
import com.multi.biz.ProductBiz;
import com.multi.biz.UserBiz;
import com.multi.vo.BoxVO;
import com.multi.vo.ProductVO;
import com.multi.vo.UserVO;

/**
 * @author noranbear
 * @date 2022. 6. 21.
 * @version 4.0
 * @description
 * 화면을 이어주는 Controller
 *
 * ====================================================================
 * 	    DATE			 AUTHOR				        NOTE
 * --------------------------------------------------------------------
 *  2022. 06. 21.		noranbear		        First Creation
 *									     Adding box controller methods
 *
 *  					qwaszx357		   		loginlmpl add
 *  					        		   		signuplmpl add
 *  
 *  2022. 06. 24.		qwaszx357				 Search add
 *  
 *	2022. 06. 25.		noranbear			 	 box 연결 수정
 *												 nobox 추가
 *
 *	2022. 06. 26.							  news, ndetail 추가
 * ====================================================================
 */
@Controller
public class MainController {

	@Autowired
	UserBiz ubiz;
	
	@Autowired
	ProductBiz pbiz;
	
	@Autowired
	BoxBiz bbiz;
	
	
	@RequestMapping("/")
	public String main(Model m) {
		List<ProductVO> alist = null;
		List<ProductVO> rlist = null;
		List<ProductVO> slist = null;
		List<ProductVO> nlist = null;
		try {
			alist = pbiz.getactionhome();
			m.addAttribute("alist", alist);
			rlist = pbiz.getrpghome();
			m.addAttribute("rlist", rlist);
			slist = pbiz.getsportshome();
			m.addAttribute("slist", slist);
			nlist = pbiz.newgame();
			m.addAttribute("nlist", nlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "center");
		return "/index";
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
	public String loginimpl(Model m, String id, String pwd, HttpSession session){
		UserVO user = null;
		try {
			user = ubiz.getuserid(id);
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


	/*
	 * profile
	 */
		@RequestMapping("/profile")
	public String profile(Model m, HttpSession session) {
		UserVO user = null;
		user = (UserVO) session.getAttribute("loginuser");
		if (user.getId() != null) {
			try {
				m.addAttribute("u", user);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		m.addAttribute("center", "profile");
		return "/index";
	}
  
  	@RequestMapping("/update")
	public String update(Model m, UserVO user, HttpSession session) {
		try {
			ubiz.modify(user);
			session.setAttribute("loginuser", user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/index";
	}
	
	
	/*
	 * cate
	 */
	@RequestMapping("/category")
	public String category(Model m) {
		m.addAttribute("center", "category");
		return "/index";
	}
	
	@RequestMapping("/detail")
    public String detail(Model m, int id) {
        ProductVO obj = null;
        try {
            obj = pbiz.get(id);
            m.addAttribute("dp", obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        m.addAttribute("center", "detail");
        return "/index";
    }
	
	
	/*
	 * News
	 */
	@RequestMapping("/news")
	public String news(Model m) {
		m.addAttribute("center", "news/news");
		return "/index";
	}
	
	@RequestMapping("/ndetail")
	public String ndetail(Model m) {
		m.addAttribute("center", "news/news-detail");
		return "/index";
  }
	
	
	/*
	 * box
	 */
	@RequestMapping("/box")
	public String box(Model m) {
		m.addAttribute("center", "box/bmain");
		m.addAttribute("bcenter", "box/bcenter");
		return "/index";
	}
	
	@RequestMapping("/wishlist")
	public String wishlist(Model m, HttpSession session) {
		List<BoxVO> list = null;
		UserVO user = null;
		user = (UserVO) session.getAttribute("loginuser");
		if (user.getId() != null) {
			try {
				list = bbiz.getwish(user.getId());
				m.addAttribute("wlist", list);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			m.addAttribute("bcenter", "box/nobox");
		}
		m.addAttribute("center", "box/bmain");
		m.addAttribute("bcenter", "box/wishlist");
		return "/index";
	}
	
	@RequestMapping("/deletewish")
	public String deletewish(Model m, int id) {
		try {
			bbiz.remove(id);
			m.addAttribute("center", "box/bmain");
			m.addAttribute("bcenter", "box/wishlist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:select";
	}
	
	@RequestMapping("/allgame")
	public String allgame(Model m) {
		m.addAttribute("center", "box/bmain");
		m.addAttribute("bcenter", "box/allgame");
		return "/index";
	}
	
	// 로그인 안 했을 때의 Library 화면 - (테스트 용) 없애야 할 듯
	@RequestMapping("/nobox")
	public String nobox(Model m) {
		m.addAttribute("center", "box/bmain");
		m.addAttribute("bcenter", "box/nobox");
		return "/index";
	}
	
	
	/*
	 * cart
	 */
	@RequestMapping("/cart")
	public String cart(Model m, BoxVO b, HttpSession session) {
		List<BoxVO> list = null;
		BoxVO total = null;
		UserVO user = null;
		user = (UserVO) session.getAttribute("loginuser");
		if (user.getId() != null) {
			try {
				list = bbiz.getcart(user.getId());
				m.addAttribute("clist", list);
				total = bbiz.gettotal(user.getId());
				m.addAttribute("total", total);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		m.addAttribute("center", "cart/cart");
		return "/index";
	}
	
	@RequestMapping("/payment")
	public String payment(Model m, BoxVO b, HttpSession session) {
		BoxVO total = null;
		UserVO user = null;
		user = (UserVO) session.getAttribute("loginuser");
		if (user.getId() != null) {
			try {
				total = bbiz.gettotal(user.getId());
				m.addAttribute("total", total);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		m.addAttribute("center", "cart/payment");
		return "/index";
	}
	
	@RequestMapping("/deletecart")
	public String deletecart(Model m, int id) {
		try {
			bbiz.remove(id);
			m.addAttribute("center", "cart/cart");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:select";
	}

	/*
	 * Search
	 */
	@RequestMapping("/search")
	public String search(Model m, String txt, String sort) {
		List<ProductVO> list = null;
		try {
			if(sort.equals("1")) {
				list = pbiz.search1(txt);
				m.addAttribute("sgame", list);
			} else if(sort.equals("2")) {
				list = pbiz.search2(txt);
				m.addAttribute("sgame", list);
			} else if(sort.equals("3")) {
				list = pbiz.search3(txt);
				m.addAttribute("sgame", list);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "search");
		return "/index";
	}
}
	
