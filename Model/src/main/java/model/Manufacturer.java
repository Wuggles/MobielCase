package model;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer {

	private String name;
	private String location;
	private List<Mobile> mobilelist = new ArrayList<Mobile>();

	public Manufacturer() {
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Mobile> getMobilelist() {
		return mobilelist;
	}

	public void setMobilelist(List<Mobile> mobilelist) {
		this.mobilelist = mobilelist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
