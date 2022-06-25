package com.multi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hongjihu
 * @date 2022. 6. 20.
 * @version 1.0
 * @description
 * BoxVO 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR				  NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			      BoxVO
 *  
 *
 * =========================================================
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BoxVO {
	
	private int id;
	private int unum; 		//foreign key
	private int pid; 		//foreign key
	private Date date;
	private String kind;
	
	// Constructor for insert
	public BoxVO(int unum, int pid, String kind) {
		
		this.unum = unum;
		this.pid = pid;
		this.kind = kind;
	}
	
}
