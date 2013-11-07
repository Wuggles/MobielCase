package mobilebeans;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import model.Manufacturer;
import dao.ManufacturerDao;

/**
 * Session Bean implementation class ManufacturerBean
 */
@Stateless(mappedName="manufacturerBean")
public class ManufacturerBean implements ManufacturerBeanLocal {

	@Inject ManufacturerDao manufacturerDao;
	
    public ManufacturerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Manufacturer getManufacturerByName(String name) {
		return manufacturerDao.getManufacturerByName(name);
	}

	@Override
	public List<Manufacturer> getManufacturers() {
		return manufacturerDao.getAllManufacturers();
	}

	@Override
	public void addManufacturer(Manufacturer manufacturer) {
		System.out.println("test");
		manufacturerDao.addManufacturer(manufacturer);
		
	}

}
