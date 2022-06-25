package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.OdetailMapper;
import com.multi.vo.OdetailVO;
/**
 * @author najune
 * @date 2022. 06. 20
 * @version 1.0
 * @description
 * OdetailBiz
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022.06.20			  najune			      First creation
 *
 * =========================================================
 */
@Service("odetailbiz")
public class OdetailBiz implements Biz<Integer, OdetailVO> {
	
	@Autowired
	OdetailMapper dao;

	@Override
	public void register(OdetailVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(OdetailVO v) throws Exception {	
		// 필요없음
	}
	
	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public OdetailVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<OdetailVO> get() throws Exception {
		return dao.selectall();
	}

}
