package com.multi.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.frame.Biz;
import com.multi.mapper.ImageMapper;
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
@Service("imagebiz")
public class ImageBiz implements Biz<Integer, ImageVO> {

    @Autowired
    ImageMapper dao;
    
    @Override
    public void register(ImageVO v) throws Exception {
        dao.insert(v);
    }

    @Override
    public void remove(Integer k) throws Exception {
        dao.delete(k);
    }

    @Override
    public void modify(ImageVO v) throws Exception {
        dao.update(v);
    }

    @Override
    public ImageVO get(Integer k) throws Exception {
        return dao.select(k);
    }

    @Override
    public List<ImageVO> get() throws Exception {
        return dao.selectall();
    }

}