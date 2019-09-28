package org.sas.service.logincheck.com.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "t_blacklist_info")
public class BlackList implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8373419910317090645L;
	
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private String uid;
	private int inBlackList;
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
	public int getInBlackList() {
		return inBlackList;
	}
	public void setInBlackList(int inBlackList) {
		this.inBlackList = inBlackList;
	}
	
	
}
