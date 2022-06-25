package com.multi.odetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OdetailBiz;
import com.multi.vo.OdetailVO;
/**
 * @author najune
 * @date
 * @version 1.0
 * @description
 * OdetailInsertTest
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
class OdetailInsertTests {

	@Autowired
	OdetailBiz biz;
	
	@Test
	void contextLoads() {
		OdetailVO obj = new OdetailVO(45,154,4);
		
		try {
			biz.register(obj);
		} catch (Exception e) {
			System.out.println(obj);
		}
	}

}


