package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.UserVO;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * UserMapper 작성
 *
 * =========================================================
 * 	    DATE			AUTHOR				  NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		hongjihu			  UserMapper
 *  
 *
 * =========================================================
 */
@Repository
@Mapper
public interface  UserMapper {
	
	public void insert(UserVO b) throws Exception;
	public void delete(int id) throws Exception;
	public void update(UserVO b) throws Exception;
	
	public UserVO select (int id) throws Exception;
	public List<UserVO> selectall() throws Exception;
	
}
