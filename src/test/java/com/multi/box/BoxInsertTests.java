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
 * BoxinsertTests 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR			    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			BoxinsertTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class BoxInsertTests {
	
	@Autowired
	BoxBiz biz;
	
	@Test
	void contextLoads() {
		BoxVO box = new BoxVO(2,113,"kart");
		
		try {
			biz.register(box);
			System.out.println(box);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}


