package com.multi.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UserBiz;
import com.multi.vo.UserVO;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * UserUpdateTests 작성
 *
 * =========================================================
 * 	    DATE			 AUTHOR				     NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 hongjihu			 UserUpdateTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class UserUpdateTests {
	
	@Autowired
	UserBiz biz;
	
	@Test
	void contextLoads() {
		UserVO user = new UserVO("jh13","tu13","pwd1311","1311_1@gamil.com","010-1111-2222");
		
		try {
			biz.modify(user);
			System.out.println("modify ok");
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}

}


