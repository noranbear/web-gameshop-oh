package com.multi.odetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OdetailBiz;
import com.multi.vo.OdetailVO;
/**
 * @author najune
 * @date 2022. 06. 20
 * @version 1.0
 * @description
 * OdetailSelectTest
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022.06.20			 najune			      First creation
 *
 * =========================================================
 */

@SpringBootTest
class OdetailSelectTests {
	
	@Autowired
	OdetailBiz biz;
	
	@Test
	void contextLoads() {
		OdetailVO obj = null;
		
		try {
			obj = biz.get(1);
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}