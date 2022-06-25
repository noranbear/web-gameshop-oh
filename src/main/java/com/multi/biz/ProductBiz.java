package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.ProductMapper;
import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * product 
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  2022. 6. 22.		 qwaszx357		    getaction add
 *  2022. 6. 24.		 qwaszx357		  	  RPG add
 *  										search add
 *  
 * =========================================================
 */
@Service("productbiz")
public class ProductBiz implements Biz<Integer, ProductVO> {

	@Autowired
	ProductMapper dao;
	
	@Override
	public void register(ProductVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(ProductVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public ProductVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<ProductVO> get() throws Exception {
		return dao.selectall();
	}
	
	// New
	public List<ProductVO> newgame() throws Exception {
		return dao.newgame();
	}
	
	// Action
	public List<ProductVO> getaction() throws Exception {
		return dao.getaction();
	}
	
	public List<ProductVO> getaction1() throws Exception {
		return dao.getaction1();
	}
	
	public List<ProductVO> getaction2() throws Exception {
		return dao.getaction2();
	}
	
	public List<ProductVO> getaction3() throws Exception {
		return dao.getaction3();
	}

	// RPG
	public List<ProductVO> getrpg() throws Exception {
		return dao.getrpg();
	}
	
	public List<ProductVO> getrpg1() throws Exception {
		return dao.getrpg1();
	}
	
	public List<ProductVO> getrpg2() throws Exception {
		return dao.getrpg2();
	}
	
	public List<ProductVO> getrpg3() throws Exception {
		return dao.getrpg3();
	}
	
	// Sports
	public List<ProductVO> getsports() throws Exception {
		return dao.getsports();
	}
	
	public List<ProductVO> getsports1() throws Exception {
		return dao.getsports1();
	}
	
	public List<ProductVO> getsports2() throws Exception {
		return dao.getsports2();
	}
	
	public List<ProductVO> getsports3() throws Exception {
		return dao.getsports3();
	}

	// Search
	public List<ProductVO> search1(String txt) throws Exception {
		return dao.search1(txt);
	}
	
	public List<ProductVO> search2(String txt) throws Exception {
		return dao.search2(txt);
	}
	
	public List<ProductVO> search3(String txt) throws Exception {
		return dao.search3(txt);
	}
	
}
