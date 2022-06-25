package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.vo.ImageVO;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * image 데이터에 연결
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
public interface ImageMapper {
	
	public void insert(ImageVO i) throws Exception;
	public void delete(int sid) throws Exception;
	public void update(ImageVO i) throws Exception;
	
	public ImageVO select(int sid) throws Exception;
	public List <ImageVO> selectall() throws Exception;
}
