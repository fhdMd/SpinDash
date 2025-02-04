package com.spindash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="wishlist")
public class Wishlist {

	@Id
	@Column(name="wishid")
	int wishid;
	
	@Column(name="gameid")
	int gameid;
	
	@Column(name="userid")
	int userid;

	public int getWishid() {
		return wishid;
	}

	public void setWishid(int wishid) {
		this.wishid = wishid;
	}

	public int getGameid() {
		return gameid;
	}

	public void setGameid(int gameid) {
		this.gameid = gameid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Wishlist [wishid=" + wishid + ", gameid=" + gameid + ", userid=" + userid
				+ "]";
	}

	public Wishlist(int wishid, int gameid, int userid, int quantity) {
		super();
		this.wishid = wishid;
		this.gameid = gameid;
		this.userid = userid;
	}

	public Wishlist() {
		super();
	}

	public Wishlist(int gameid, int userid) {
		super();
		this.gameid = gameid;
		this.userid = userid;
	}
	
	
	
	
}
