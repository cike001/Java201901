package com.gwy.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class User implements Serializable{

	private String id;
	private String name;
	private Date birth;
	
	public static void main(String[] args) {
		User user = new User();
		
		user.setId("1").setName("zhangsan");
		
		System.out.println(user.toString());
		
	}
	
}
