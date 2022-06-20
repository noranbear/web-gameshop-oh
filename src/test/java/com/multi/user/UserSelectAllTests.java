package com.multi.user;

import java.util.List;

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
 * UserSelectAllTests 작성
 *
 * =========================================================
 * 	    DATE			 AUTHOR				  NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 hongjihu		UserSelectAllTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class UserSelectAllTests {
	
	@Autowired
	UserBiz biz;
	
	@Test
	void contextLoads() {
		List<UserVO> list=null;
		
		try {
			list=biz.get();
			for (UserVO uservo:list) {
				System.out.println(uservo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


