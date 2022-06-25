package com.multi.box;

import java.util.List;

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
 * BoxSelectAllTests 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR			     NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			BoxSelectAllTests
 *  
 *
 * =========================================================
 */
@SpringBootTest
public class BoxSelectAllTests {
	
	@Autowired
	BoxBiz biz;
	
	@Test
	void contextLoads() {
		List<BoxVO> list=null;
		
		try {
			list=biz.get();
			for (BoxVO boxvo:list) {
				System.out.println(boxvo);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}


