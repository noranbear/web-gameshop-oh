package com.multi.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrderBiz;
/**
 * @author najune
 * @date
 * @version 1.0
 * @description
 * OrderDeleteTest
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
class OrderDeleteTests {
	
	@Autowired
	OrderBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			System.out.println("ok1");
			biz.remove(1);
			System.out.println("ok2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
