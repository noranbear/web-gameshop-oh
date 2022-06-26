package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.BoxVO;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 2.0
 * @description
 * BoxMapper 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR				  NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			      BoxMapper
 *  2022. 6. 26.		  qwaszx357			  selectuser add	
 *
 * =========================================================
 */
@Repository
@Mapper
public interface  BoxMapper {
	
	public void insert(BoxVO b) throws Exception;
	public void delete(Integer k) throws Exception;
	public void update(BoxVO b) throws Exception;
	
	public BoxVO select (Integer k) throws Exception;
	public List <BoxVO> selectall() throws Exception;
	
	public List <BoxVO> selectuser1(String k) throws Exception;

}
