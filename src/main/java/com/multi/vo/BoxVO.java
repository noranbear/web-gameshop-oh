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
 * @version 2.0
 * @description
 * BoxVO 작성
 *
 * =========================================================
 * 	    DATE			   AUTHOR				  NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		   hongjihu			      BoxVO
 *  2022. 6. 26.	      qwaszx357			  user 컬럼 추가
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
	
	private String uname;
	private String uid;
	private String pname;
	private int price;
	private String imgname;
	private int cnt;
	private int tprice;
	
	private int rating;
	
	// Constructor for insert
	public BoxVO(int unum, int pid, String kind) {
		
		this.unum = unum;
		this.pid = pid;
		this.kind = kind;
	}
	
	// Constructor for update
	public BoxVO(int id, int unum, int pid, String kind) {
		
		this.id = id;
		this.unum = unum;
		this.pid = pid;
		this.kind = kind;
	}
	
}
