package com.multi.cate;

import java.util.List;

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
 * Cate SelectAll Test
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@SpringBootTest
class CateSelectAllTests {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		List<CateVO> list = null;
		
		try {
			list = biz.get();
			for (CateVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
