package com.multi.product;

import java.util.List;

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
 * Product Search3 Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 25.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ProductSearch3Tests {
	
	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.search3("pa");
			for (ProductVO p : list) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


