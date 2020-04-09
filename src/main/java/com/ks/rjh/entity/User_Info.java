package com.ks.rjh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User_Info {
	
	   private String id;
	   @Id
	   private int no;
	   private String password;
	   private String auth1;
	   private String status;
	   private String reg_date;
	   private String email;
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no セットする no
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return auth1
	 */
	public String getAuth1() {
		return auth1;
	}
	/**
	 * @param auth1 セットする auth1
	 */
	public void setAuth1(String auth1) {
		this.auth1 = auth1;
	}
	/**
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status セットする status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return reg_date
	 */
	public String getReg_date() {
		return reg_date;
	}
	/**
	 * @param reg_date セットする reg_date
	 */
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User_info [id=" + id + ", no=" + no + ", password=" + password + ", auth1=" + auth1 + ", status="
				+ status + ", reg_date=" + reg_date + ", email=" + email + "]";
	}
	
}
