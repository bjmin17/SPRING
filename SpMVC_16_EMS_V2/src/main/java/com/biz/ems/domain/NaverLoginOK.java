package com.biz.ems.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NaverLoginOK {

	private String code;
	private String state;
	private String email;
	private String nickname;
	private String name;
	
	
	
}
