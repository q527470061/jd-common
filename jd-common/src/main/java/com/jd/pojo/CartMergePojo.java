package com.jd.pojo;

public class CartMergePojo {

	private Long userId;
	
	public CartMergePojo(Long userId, String tmp_user_key) {
		super();
		this.userId = userId;
		this.tmp_user_key = tmp_user_key;
	}
	public CartMergePojo() {}

	private String tmp_user_key;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTmp_user_key() {
		return tmp_user_key;
	}

	public void setTmp_user_key(String tmp_user_key) {
		this.tmp_user_key = tmp_user_key;
	}
	
}
