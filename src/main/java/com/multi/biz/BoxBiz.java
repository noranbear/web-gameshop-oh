package com.multi.biz;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.BoxMapper;
import com.multi.vo.BoxVO;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * BoxBiz 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			      	BoxBiz
 *  2022. 6. 26.		  qwaszx357			    getuser add
 *
 * =========================================================
 */
@Service
public class BoxBiz implements Biz<Integer, BoxVO>  {
	
	@Autowired
	BoxMapper dao;
	
	@Override
	public void register(BoxVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(BoxVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public BoxVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<BoxVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<BoxVO> getuser1(String k) throws Exception {
		return dao.selectuser1(k);
	}
}
