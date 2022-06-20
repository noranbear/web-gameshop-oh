package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Cate Delete Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class CateDeleteTests {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(0);
			System.out.println("Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
