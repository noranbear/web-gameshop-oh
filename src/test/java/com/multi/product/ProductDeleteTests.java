package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Product Delete Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ProductDeleteTests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(100);
			System.out.println("removed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
