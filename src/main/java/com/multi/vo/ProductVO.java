package com.multi.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 2.0
 * @description
 * Product value object
 *
 * =========================================================
 * 	    DATE			   AUTHOR			 NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357		First creation
 *  
 *  2022. 6. 23.		 qwaszx357		  imgname add
 *  
 *  2022. 7. 07.		 qwaszx357		  수정된 컬럼 추가
 *
 * =========================================================
 */

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ProductVO {
	
	private int id;
	private String name;
	private String intro;
	private int price;
	private String bite;
	private String dev;
	private String reldate;
	private int ctid;
	private String gtype;
	private String played;
	private int rating;
	
	private String imgname;
	private String catename;
	
	// Constructor for insert, update
	public ProductVO(int id, String name, int price, String bite, String dev, String reldate, int ctid) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.bite = bite;
		this.dev = dev;
		this.reldate = reldate;
		this.ctid = ctid;
	}
	
	
}
