package org.sas.service.login.com.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "t_user_info")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8373419910317090645L;
	
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private String uid;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
