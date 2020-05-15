package com.ks.rjh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
@NamedQuery(
        name = "User_Info.*",
        query = "select u from User_Info u where u.u_no = :u_no")
public class User_Info {
	@Id
	private int no;
	@Column(insertable = false)
	private String u_no;
	@Column(insertable = false)
	private String name;
	@Column(insertable = false)
	private String gender;
	@Column(insertable = false)
	private String address;
	@Column(insertable = false)
	private String mobile_number;
	@Column(insertable = false)
	private String birth_day;
	@Column(insertable = false)
	private String hire_date;
	@Column(insertable = false)
	private String reg_date;
	@Column(insertable = false)
	private String upd_date;
	@Column(insertable = false)
	private String upd_user;
	
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
	 * @return u_no
	 */
	public String getU_no() {
		return u_no;
	}

	/**
	 * @param u_no セットする u_no
	 */
	public void setU_no(String u_no) {
		this.u_no = u_no;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender セットする gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address セットする address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return mobile_number
	 */
	public String getMobile_number() {
		return mobile_number;
	}

	/**
	 * @param mobile_number セットする mobile_number
	 */
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	/**
	 * @return birth_day
	 */
	public String getBirth_day() {
		return birth_day;
	}

	/**
	 * @param birth_day セットする birth_day
	 */
	public void setBirth_day(String birth_day) {
		this.birth_day = birth_day;
	}

	/**
	 * @return hire_date
	 */
	public String getHire_date() {
		return hire_date;
	}

	/**
	 * @param hire_date セットする hire_date
	 */
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
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
	 * @return upd_date
	 */
	public String getUpd_date() {
		return upd_date;
	}

	/**
	 * @param upd_date セットする upd_date
	 */
	public void setUpd_date(String upd_date) {
		this.upd_date = upd_date;
	}

	/**
	 * @return upd_user
	 */
	public String getUpd_user() {
		return upd_user;
	}

	/**
	 * @param upd_user セットする upd_user
	 */
	public void setUpd_user(String upd_user) {
		this.upd_user = upd_user;
	}

	@Override
	public String toString() {
		return "User_info [u_no=" + u_no + ", no=" + no + ", gender=" + gender + ", name=" + name + ", address="
				+ address + ", reg_date="+ reg_date +", birth_day"+ birth_day +", hire_date"+ hire_date +
				", upd_date" + upd_date + ", mobile_number=" + mobile_number + ", upd_user" + upd_user + "]";
	}
}
