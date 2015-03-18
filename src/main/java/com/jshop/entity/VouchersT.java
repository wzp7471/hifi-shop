package com.jshop.entity;

// Generated 2014-10-9 18:51:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VouchersT generated by hbm2java
 */
@Entity
@Table(name = "vouchers_t", catalog = "jshoper3")
public class VouchersT implements java.io.Serializable {

	private String vouchersid;
	private String vouchersname;
	private String begintime;
	private String endtime;
	private String voucherscontent;
	private double limitprice;
	private String givenmemberid;
	private String voucherstate;
	private String voucheruseway;
	private String state;
	private Date createtime;
	private String creatorid;
	private String mobilesync;

	public VouchersT() {
	}

	public VouchersT(String vouchersid, String vouchersname, String begintime,
			String endtime, String voucherscontent, double limitprice,
			String voucherstate, String voucheruseway, String state,
			Date createtime, String creatorid) {
		this.vouchersid = vouchersid;
		this.vouchersname = vouchersname;
		this.begintime = begintime;
		this.endtime = endtime;
		this.voucherscontent = voucherscontent;
		this.limitprice = limitprice;
		this.voucherstate = voucherstate;
		this.voucheruseway = voucheruseway;
		this.state = state;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	public VouchersT(String vouchersid, String vouchersname, String begintime,
			String endtime, String voucherscontent, double limitprice,
			String givenmemberid, String voucherstate, String voucheruseway,
			String state, Date createtime, String creatorid, String mobilesync) {
		this.vouchersid = vouchersid;
		this.vouchersname = vouchersname;
		this.begintime = begintime;
		this.endtime = endtime;
		this.voucherscontent = voucherscontent;
		this.limitprice = limitprice;
		this.givenmemberid = givenmemberid;
		this.voucherstate = voucherstate;
		this.voucheruseway = voucheruseway;
		this.state = state;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.mobilesync = mobilesync;
	}

	@Id
	@Column(name = "VOUCHERSID", unique = true, nullable = false, length = 20)
	public String getVouchersid() {
		return this.vouchersid;
	}

	public void setVouchersid(String vouchersid) {
		this.vouchersid = vouchersid;
	}

	@Column(name = "VOUCHERSNAME", nullable = false, length = 20)
	public String getVouchersname() {
		return this.vouchersname;
	}

	public void setVouchersname(String vouchersname) {
		this.vouchersname = vouchersname;
	}

	@Column(name = "BEGINTIME", nullable = false, length = 20)
	public String getBegintime() {
		return this.begintime;
	}

	public void setBegintime(String begintime) {
		this.begintime = begintime;
	}

	@Column(name = "ENDTIME", nullable = false, length = 20)
	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	@Column(name = "VOUCHERSCONTENT", nullable = false, length = 45)
	public String getVoucherscontent() {
		return this.voucherscontent;
	}

	public void setVoucherscontent(String voucherscontent) {
		this.voucherscontent = voucherscontent;
	}

	@Column(name = "LIMITPRICE", nullable = false, precision = 10)
	public double getLimitprice() {
		return this.limitprice;
	}

	public void setLimitprice(double limitprice) {
		this.limitprice = limitprice;
	}

	@Column(name = "GIVENMEMBERID", length = 20)
	public String getGivenmemberid() {
		return this.givenmemberid;
	}

	public void setGivenmemberid(String givenmemberid) {
		this.givenmemberid = givenmemberid;
	}

	@Column(name = "VOUCHERSTATE", nullable = false, length = 1)
	public String getVoucherstate() {
		return this.voucherstate;
	}

	public void setVoucherstate(String voucherstate) {
		this.voucherstate = voucherstate;
	}

	@Column(name = "VOUCHERUSEWAY", nullable = false, length = 1)
	public String getVoucheruseway() {
		return this.voucheruseway;
	}

	public void setVoucheruseway(String voucheruseway) {
		this.voucheruseway = voucheruseway;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "MOBILESYNC", length = 1)
	public String getMobilesync() {
		return this.mobilesync;
	}

	public void setMobilesync(String mobilesync) {
		this.mobilesync = mobilesync;
	}

}
