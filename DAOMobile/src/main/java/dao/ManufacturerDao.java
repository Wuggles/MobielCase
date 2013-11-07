package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Manufacturer;

public class ManufacturerDao implements Dao {
	
	@PersistenceContext(unitName="live")
	EntityManager em;
	
	public List<Manufacturer> getAllManufacturers() {
		List<Manufacturer> manufacturers = em.createQuery("SELECT manufacturer FROM Manufacturer manufacturer", Manufacturer.class).getResultList();
		return manufacturers;	
	}
	
	public Manufacturer getManufacturerByName(String name) {
		Manufacturer manufacturer = em.find(Manufacturer.class, name);
		return manufacturer;
	}
	
	public void addManufacturer(Manufacturer manufacturer) {
		em.persist(manufacturer);
		em.flush();
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
}
