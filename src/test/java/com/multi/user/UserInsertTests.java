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
 * UserInsert 작성
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 hongjihu			  UserInsert
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class UserInsertTests {
	
	@Autowired
	UserBiz biz;
	
	@Test
	void contextLoads() {
		UserVO user = new UserVO("jh15","tu15","pwd1511","1311@gamil.com","010-1112-2222");
		
		try {
			biz.register(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


