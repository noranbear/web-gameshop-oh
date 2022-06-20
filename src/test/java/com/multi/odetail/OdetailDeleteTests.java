package com.multi.odetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OdetailBiz;
/**
 * @author najune
 * @date
 * @version 1.0
 * @description
 * OdetailDeleteTest
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
class OdetailDeleteTests {
	
	@Autowired
	OdetailBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			System.out.println("ok1");
			biz.remove(1);
			System.out.println("ok2");
		} catch (Exception e) {
			
		}
	}

}
