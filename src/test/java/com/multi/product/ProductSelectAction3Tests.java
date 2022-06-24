package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 22.
 * @version 1.0
 * @description
 * Product Select Action3 Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				 NOTE
 * ---------------------------------------------------------
 *  2022. 6. 22.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ProductSelectAction3Tests {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		
		try {
			list = biz.getaction3();
			for (ProductVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
