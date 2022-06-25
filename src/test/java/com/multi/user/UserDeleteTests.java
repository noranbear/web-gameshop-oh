package com.multi.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UserBiz;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * UserDelete 작성
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 hongjihu			  UserDelete
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class UserDeleteTests {
	
	@Autowired
	UserBiz biz;
	
	@Test
	void contextLoads() {
	
		try {
			biz.remove(4);
			System.out.println("delete ok");
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}

}


