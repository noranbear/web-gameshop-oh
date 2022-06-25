package com.multi.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.UserBiz;
import com.multi.vo.UserVO;
/**
 * @author qwaszx357
 * @date 2022. 6. 21.
 * @version 1.0
 * @description
 * User Selectid Tests 작성
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 21.	    qwaszx357		  UserSelectidTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class UserSelectIdTests {
	
	@Autowired
	UserBiz biz;
	
	@Test
	void contextLoads() {
		UserVO obj=null;
		
		try {
			obj =biz.getid("hs55");
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


