package mobilebeans;

import java.util.List;

import javax.ejb.Remote;

import model.Manufacturer;

@Remote
public interface ManufacturerBeanLocal {

	public Manufacturer getManufacturerByName(String name);
	public List<Manufacturer> getManufacturers();
	public void addManufacturer(Manufacturer manufacturer);
	
}
