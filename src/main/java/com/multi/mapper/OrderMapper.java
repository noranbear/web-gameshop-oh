package com.multi.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.multi.vo.OrderVO;

/**
 * @author najune
 * @date
 * @version 1.0
 * @description
 * OrderMapper
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022.06.20			  najune			      First creation
 *
 * =========================================================
 */

@Repository
@Mapper
public interface OrderMapper {
	
	public void insert(OrderVO order) throws Exception;
	public void delete(int num) throws Exception;
	public void update(OrderVO order) throws Exception;
	
	public OrderVO select(int num) throws Exception;
	public List<OrderVO> selectall() throws Exception;
}
