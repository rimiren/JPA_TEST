package com.ks.rjh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "workplaceinfo")
@NamedQuery(
		name = "workplaceinfo.*",
		query = "select u from workplaceinfo u where u.u_no = :u_no")
public class workplaceinfo {
	
	@Id
	private int no;
	@Column(insertable = false)
	private String u_no;
	@Column(insertable = false)
	private String wp_name;
	@Column(insertable = false)
	private String min_time;
	@Column(insertable = false)
	private String max_time;
	@Column(insertable = false)
	private String reg_date;
	
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
	 * @return wp_name
	 */
	public String getWp_name() {
		return wp_name;
	}

	/**
	 * @param wp_name セットする wp_name
	 */
	public void setWp_name(String wp_name) {
		this.wp_name = wp_name;
	}

	/**
	 * @return min_time
	 */
	public String getMin_time() {
		return min_time;
	}

	/**
	 * @param min_time セットする min_time
	 */
	public void setMin_time(String min_time) {
		this.min_time = min_time;
	}

	/**
	 * @return max_time
	 */
	public String getMax_time() {
		return max_time;
	}

	/**
	 * @param max_time セットする max_time
	 */
	public void setMax_time(String max_time) {
		this.max_time = max_time;
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

	@Override
	public String toString() {
		return "workplaceinfo [u_no=" + u_no + ", no=" + no + ", wp_name=" + wp_name + ", min_time=" + min_time + ", max_time="
				+ max_time + ", reg_date=" + reg_date + "]";
	}

}
