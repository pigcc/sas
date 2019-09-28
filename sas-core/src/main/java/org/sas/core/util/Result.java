package org.sas.core.util;

public class Result<T> {
	private boolean success;
	private String msg;
	private T data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Result() {
		this.success = true;
		this.msg = "请求成功";
		this.data = null;
	}

	public Result(boolean success) {
		this.success = success;
	}

	public Result(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}

	public Result(boolean success, String msg, T data) {
		this.data = data;
		this.success = success;
		this.msg = msg;
	}

}
