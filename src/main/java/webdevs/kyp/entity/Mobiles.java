package webdevs.kyp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobiles {
	
	@Id
	private int id;
	private String brand;
	private String model;
	private double price;
	private int rating;
	private String imageurl;
	public Mobiles() {
		super();
	}
	public Mobiles(int id, String brand, String model, int price, int rating, String imageurl) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.rating = rating;
		this.imageurl = imageurl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getImageurl() {
		return imageurl;
	}
	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	
}
