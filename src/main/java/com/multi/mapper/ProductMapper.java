package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ProductVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * product 데이터에 연결
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357		   First creation
 *  
 * =========================================================
 */
@Repository
@Mapper
public interface ProductMapper {
	
	public void insert(ProductVO p) throws Exception;
	public void delete(int id) throws Exception;
	public void update(ProductVO p) throws Exception;
	
	public ProductVO select(int id) throws Exception;
	public List<ProductVO> selectall() throws Exception;
}
