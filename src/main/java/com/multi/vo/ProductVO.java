package com.multi.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author qwaszx357
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * Product value object
 *
 * =========================================================
 * 	    DATE			   AUTHOR			 NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357		First creation
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
	private int price;
	private String bite;
	private String dev;
	private String reldate;
	private int ctid;
	
	// Constructor for update
	public ProductVO(String name, int price, String bite, String dev, String reldate, int ctid) {
		
		this.name = name;
		this.price = price;
		this.bite = bite;
		this.dev = dev;
		this.reldate = reldate;
		this.ctid = ctid;
	}
	
	
}
