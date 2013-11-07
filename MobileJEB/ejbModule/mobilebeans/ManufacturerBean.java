package mobilebeans;

import java.util.List;

import javax.ejb.Stateless;

import model.Manufacturer;

/**
 * Session Bean implementation class ManufacturerBean
 */
@Stateless
public class ManufacturerBean implements ManufacturerBeanLocal {

    /**
     * Default constructor. 
     */
    public ManufacturerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Manufacturer getManufacturerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manufacturer> getManufacturers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addManufacturer(Manufacturer manufacturer) {
		// TODO Auto-generated method stub
		
	}

}
