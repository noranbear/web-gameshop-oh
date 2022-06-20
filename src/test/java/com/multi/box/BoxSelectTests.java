package com.multi.box;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.BoxBiz;
import com.multi.vo.BoxVO;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * BoxSelectTests 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR			    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			BoxSelectTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class BoxSelectTests {
	
	@Autowired
	BoxBiz biz;
	
	@Test
	void contextLoads() {
		BoxVO obj=null;
		
		try {
			obj =biz.get(6);
			System.out.println(obj);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}


