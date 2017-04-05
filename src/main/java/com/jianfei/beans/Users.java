/**
 * Project a-web
 * @author changchun.wu
 * NowTime 2017年4月5日上午11:47:23
 */
package com.jianfei.beans;

public class Users {
	private Integer id;
	private String name;
	private String pwd;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}

