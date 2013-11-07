package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Manufacturer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String name;
	private String location;
	@OneToMany
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
