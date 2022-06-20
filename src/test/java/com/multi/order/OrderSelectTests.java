package com.multi.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrderBiz;
import com.multi.vo.OrderVO;
/**
 * @author najune
 * @date 2022. 06. 20
 * @version 1.0
 * @description
 * OrderSelectTest
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022.06.20			 najune			      First creation
 *
 * =========================================================
 */
@SpringBootTest
class OrderSelectTests {
	
	@Autowired
	OrderBiz biz;
	
	@Test
	void contextLoads() {
		OrderVO obj = null;
		
		try {
			obj = biz.get(1);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}