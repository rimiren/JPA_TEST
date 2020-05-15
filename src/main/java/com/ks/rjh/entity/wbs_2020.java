package com.ks.rjh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "wbs_2020")
@NamedQuery(
		name = "wbs_2020.*",
		query = "select u from wbs_2020 u where u.u_no = :u_no")

public class wbs_2020 {
	@Id
	private int no;
	private String u_no;
	private String date;
	private String start_time;
	private String end_time;
	private String rest_time;
	private String vacation_type;
	private String memo;
	private String reg_date;
	private String upd_date;
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
	 * @return date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date セットする date
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return start_time
	 */
	public String getStart_time() {
		return start_time;
	}
	/**
	 * @param start_time セットする start_time
	 */
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	/**
	 * @return end_time
	 */
	public String getEnd_time() {
		return end_time;
	}
	/**
	 * @param end_time セットする end_time
	 */
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	/**
	 * @return rest_time
	 */
	public String getRest_time() {
		return rest_time;
	}
	/**
	 * @param rest_time セットする rest_time
	 */
	public void setRest_time(String rest_time) {
		this.rest_time = rest_time;
	}
	/**
	 * @return vacation_type
	 */
	public String getVacation_type() {
		return vacation_type;
	}
	/**
	 * @param vacation_type セットする vacation_type
	 */
	public void setVacation_type(String vacation_type) {
		this.vacation_type = vacation_type;
	}
	/**
	 * @return memo
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * @param memo セットする memo
	 */
	public void setMemo(String memo) {
		this.memo = memo;
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
	@Override
	public String toString() {
		return "wbs_2020 [u_no=" + u_no + ", no=" + no + ", date=" + date + ",start_time=" + start_time + ", end_time="
				+ end_time +", vacation_type" + vacation_type + ", memo" + memo + ", reg_date=" + reg_date + ", upd_date=" + upd_date + "]";
	}
	

}
