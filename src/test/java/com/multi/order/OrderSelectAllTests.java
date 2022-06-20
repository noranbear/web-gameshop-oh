package com.multi.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.OrderBiz;
import com.multi.vo.OrderVO;
/**
 * @author najune
 * @date 2022. 06. 20
 * @version 1.0
 * @description
 * OrderSelectAllTest
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022.06.20			 najune			  First creation
 *
 * =========================================================
 */
@SpringBootTest
class OrderSelectAllTests {
	
	@Autowired
	OrderBiz biz;

	@Test
	void contextLoads() {
		List<OrderVO> list = null;
		
		try {
			list = biz.get();
			for (OrderVO OrderVO : list) {
				System.out.println(OrderVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





