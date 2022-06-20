package com.multi.image;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ImageBiz;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Image Delete Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ImageDeleteTests {

	@Autowired
	ImageBiz biz;
	
	@Test
	void contextLoads() {
		
		try {
			biz.remove(1000);
			System.out.println("Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
