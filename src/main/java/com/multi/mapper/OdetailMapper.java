package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.multi.vo.OdetailVO;
/**
 * @author najune
 * @date 2022. 06. 20

 * @version 1.0
 * @description
 * OdetailMapper
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022.06.20			 najune			      First creation
 *
 * =========================================================
 */
@Repository
@Mapper
public interface OdetailMapper {
	
	public void insert(OdetailVO odetail) throws Exception;
	public void delete(int num) throws Exception;
	
	public OdetailVO select(int num) throws Exception;
	public List<OdetailVO> selectall() throws Exception;
}
