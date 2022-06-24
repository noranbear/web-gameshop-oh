package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 24.
 * @version 1.0
 * @description
 * Product Select RPG1 Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				 NOTE
 * ---------------------------------------------------------
 *  2022. 6. 24.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ProductSelectRpg1Tests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		
		try {
			list = biz.getrpg1();
			for (ProductVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
