package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.OrderMapper;
import com.multi.vo.OrderVO;
/**
 * @author najune
 * @date 2022. 06. 20
 * @version 1.0
 * @description
 * OrderBiz
 *
 *
 * =========================================================
 * 	    DATE			 AUTHOR				    NOTE
 * ---------------------------------------------------------
 *  2022.06.20			 najune			      First creation
 *
 * =========================================================
 */

@Service("orderbiz")
public class OrderBiz implements Biz<Integer, OrderVO> {
	
	@Autowired
	OrderMapper dao;
	
	@Override
	public void register(OrderVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(OrderVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public OrderVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<OrderVO> get() throws Exception {
		return dao.selectall();
	}

}
