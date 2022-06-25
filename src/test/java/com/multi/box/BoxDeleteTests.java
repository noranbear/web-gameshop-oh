package com.multi.box;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.BoxBiz;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * BoxdeleteTests 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR				  NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			  BoxdeleteTests
 *  
 *
 * =========================================================
 */

@SpringBootTest
public class BoxDeleteTests {
	
	@Autowired
	BoxBiz biz;
	
	@Test
	void contextLoads() {
	
		try {
			biz.remove(8);
			System.out.println("delete ok");
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}

}


