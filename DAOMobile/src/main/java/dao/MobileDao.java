package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Manufacturer;
import model.Mobile;

public class MobileDao implements Dao {
	
	@PersistenceContext(unitName="live")
	EntityManager em;
	
	public List<Mobile> getAllMobiles() {
		List<Mobile> mobiles = em.createQuery("SELECT mobile FROM Mobile mobile", Mobile.class).getResultList();
		return mobiles;
	}
	
	public Mobile getMobileByName(String name) {
		Mobile mobile = em.find(Mobile.class, name);
		return mobile;
	}
	
	public void addMobile(Manufacturer manufacturer, Mobile mobile) {
		//todo add to manufacturer and save
	}
}
