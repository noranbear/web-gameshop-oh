package com.multi.odetail;

import java.util.List;

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
 * OdetailSelectAllTest
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
class OdetailSelectAllTests {
	
	@Autowired
	OdetailBiz biz;

	@Test
	void contextLoads() {
		List<OdetailVO> list = null;
		
		try {
			list = biz.get();
			for (OdetailVO OdetailVO : list) {
				System.out.println(OdetailVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





