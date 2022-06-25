package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.CateVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * cate 데이터에 연결
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@Repository
@Mapper
public interface CateMapper {
	
	public void insert(CateVO c) throws Exception;
	public void delete(int id) throws Exception;
	public void update(CateVO c) throws Exception;
	
	public CateVO select(int id) throws Exception;
	public List <CateVO> selectall() throws Exception;
}
