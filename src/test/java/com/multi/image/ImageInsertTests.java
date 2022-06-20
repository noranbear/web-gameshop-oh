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
 * Image Insert Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class ImageInsertTests {

	@Autowired
	ImageBiz biz;
	
	@Test
	void contextLoads() {
		ImageVO i = new ImageVO(0,"img1",101);
		
		try {
			biz.register(i);
			System.out.println("Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
