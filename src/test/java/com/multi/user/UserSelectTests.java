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
 * UserSelectTests 작성
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 hongjihu			UserSelectTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class UserSelectTests {
	
	@Autowired
	UserBiz biz;
	
	@Test
	void contextLoads() {
		UserVO obj=null;
		
		try {
			obj =biz.get(2);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


