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
 * BoxUpdateTests 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR			    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			BoxUpdateTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class BoxUpdateTests {
	
	@Autowired
	BoxBiz biz;
	
	@Test
	void contextLoads() {
		BoxVO box = new BoxVO(6,2,110,"kart");
		
		try {
			biz.modify(box);
			System.out.println("update ok");
		} catch (Exception e) {
			System.out.println("error");
			e.printStackTrace();
		}
		
	}

}


