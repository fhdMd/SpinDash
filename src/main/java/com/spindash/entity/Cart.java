package com.spindash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@Column(name="cartid")
	int cartid;
	
	@Column(name="gameid")
	int gameid;
	
	@Column(name="userid")
	int userid;

	public int getCartid() {
		return cartid;
	}

	public void setCartid(int cartid) {
		this.cartid = cartid;
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
		return "Cart [cartid=" + cartid + ", gameid=" + gameid + ", userid=" + userid + "]";
	}

	public Cart(int cartid, int gameid, int quantity, int userid) {
		super();
		this.cartid = cartid;
		this.gameid = gameid;
		this.userid = userid;
	}

	public Cart(int gameid, int userid) {
		super();
		this.gameid = gameid;
		this.userid = userid;
	}

	public Cart() {
		super();
	}
	
	
}
