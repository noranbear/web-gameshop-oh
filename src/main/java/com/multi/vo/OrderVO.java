package com.multi.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author najune
 * @date
 * @version 1.0
 * @description
 * OrderVO 
 *
 * =========================================================
 * 	    DATE		   AUTHOR				 NOTE
 * ---------------------------------------------------------
 *  2022.06.20			najune			    First creation
 *
 * =========================================================
 */

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class OrderVO {
	
	private int num;
	private int price;
	private String status;
	private String date;
	private int unum;
	private String method;
	
}
