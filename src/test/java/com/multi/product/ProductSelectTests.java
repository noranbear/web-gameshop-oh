package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Product Select Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ProductSelectTests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO product = null;
		
		try {
			product = biz.get(101);
			System.out.println(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
