package com.multi.biz;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.UserMapper;
import com.multi.vo.UserVO;
/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * UserBiz 작성
 *
 * =========================================================
 * 	    DATE			  AUTHOR				   NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		  hongjihu			      UserBiz
 *  
 *
 * =========================================================
 */
@Service
public class UserBiz implements Biz<Integer, UserVO>  {
	
	@Autowired
	UserMapper dao;
	
	@Override
	public void register(UserVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(UserVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public UserVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<UserVO> get() throws Exception {
		return dao.selectall();
	}
	
	public UserVO getuserid(String k) throws Exception {
		return dao.selectid(k);
	} 

}
