package com.spindash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="game")
public class Game {
	@Id
	@Column(name="gameid")
	int gameid;
	@Column(name="img")
	String img;
	@Column(name="title")
	String title;
	@Column(name="price")
	float price;
	@Column(name="platform")
	String platform;
	public int getGameId() {
		return gameid;
	}
	public void setGameId(int gameId) {
		this.gameid = gameId;
	}
	public String getImgPath() {
		return img;
	}
	public void setImgPath(String imgPath) {
		this.img = imgPath;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	@Override
	public String toString() {
		return "Game [gameId=" + gameid + ", imgPath=" + img + ", title=" + title + ", price=" + price
				+ ", platform=" + platform + "]";
	}
	public Game(int gameId, String imgPath, String title, float price, String platform) {
		super();
		this.gameid = gameId;
		this.img = imgPath;
		this.title = title;
		this.price = price;
		this.platform = platform;
	}
	public Game() {
		super();
	}
}
