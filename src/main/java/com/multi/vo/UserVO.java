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
 * UserVO 작성
 *
 * =========================================================
 * 	    DATE			 AUTHOR				  NOTE
 * ---------------------------------------------------------
 *  2022. 6. 20.		 hongjihu			     UserVO
 *  
 *
 * =========================================================
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class UserVO {
	
	private int num;
	private String name;
	private String id;
	private String pwd;
	private String email;
	private String phone;
	private Date regdate;
	
	// Constructor for insert
	public UserVO(String name, String id, String pwd, String email, String phone) {
		this.name = name;
		this.id = id;		
		this.pwd = pwd;
		this.email = email;
		this.phone = phone;
	}
	
	
}
