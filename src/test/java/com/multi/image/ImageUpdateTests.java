package com.multi.image;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ImageBiz;
import com.multi.vo.ImageVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Image Update Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */

@SpringBootTest
class ImageUpdateTests {

	@Autowired
	ImageBiz biz;
	
	@Test
	void contextLoads() {
		ImageVO i = new ImageVO(1000,"img2",101);
		
		try {
			biz.modify(i);
			System.out.println("Update");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
