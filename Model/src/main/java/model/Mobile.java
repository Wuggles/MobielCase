package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {

	@Id
	private String name;
	private double price;
	private String size;
	
	public Mobile() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
