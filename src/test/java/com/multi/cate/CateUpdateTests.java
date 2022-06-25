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
 * Cate Update Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class CateUpdateTests {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO c = new CateVO(0,"action2",10);
		
		try {
			biz.modify(c);
			System.out.println("Updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
