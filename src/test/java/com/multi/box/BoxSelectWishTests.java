package com.multi.box;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.BoxBiz;
import com.multi.vo.BoxVO;
/**
 * @author qwaszx357
 * @date 2022. 6. 26.
 * @version 1.0
 * @description
 * Box Select Wish Tests 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR			    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 26.		  qwaszx357	   Box Select Wish Tests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class BoxSelectWishTests {
	
	@Autowired
	BoxBiz biz;
	
	@Test
	void contextLoads() {
		List<BoxVO> list = null;
		
		try {
			list =biz.getwish("hs55");
			for (BoxVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}


