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
 * Image value object
 *
 * =========================================================
 * 	    DATE			   AUTHOR				NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 qwaszx357			First creation
 *  
 * =========================================================
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ImageVO {
	
	private int id;
	private String name;
	private int pid;
}
