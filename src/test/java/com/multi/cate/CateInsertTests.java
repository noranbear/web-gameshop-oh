package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Cate Insert Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class CateInsertTests {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO c = new CateVO(0,"action1",10);
		
		try {
			biz.register(c);
			System.out.println("Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
