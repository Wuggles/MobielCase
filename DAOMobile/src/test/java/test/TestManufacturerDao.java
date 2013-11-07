package test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Manufacturer;
import model.Mobile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dao.ManufacturerDao;

public class TestManufacturerDao {

	private EntityManagerFactory emf;
	private EntityManager em;
	private ManufacturerDao manuDao;
	
	@Before
	public void setUpBefore() throws Exception {
		manuDao = new ManufacturerDao();
		emf = Persistence.createEntityManagerFactory("default");
		em = emf.createEntityManager();
		manuDao.setEm(em);
		
	}

	@After
	public void tearDownAfter() throws Exception {
		em.close();
		em = emf.createEntityManager();
	}
	
	@Test
	public void test() {
		
		
		Manufacturer mf = makeManufacturer();
		//make Manufacturer
		manuDao.addManufacturer(mf);
		
		//get That manufacturer again
		Manufacturer expected = mf;
		Manufacturer result = manuDao.getManufacturerByName("Samsung");
		
		//check
		assertThat(result.getLocation(), is(expected.getLocation()));
	}
	
	public Manufacturer makeManufacturer() {
		Mobile mobile = new Mobile();
		mobile.setName("Galaxy S2plus");
		mobile.setPrice(120.99);
		mobile.setSize("12cmx15cm");
		List<Mobile> list = new ArrayList<Mobile>();
		list.add(mobile);
		
		Manufacturer mf = new Manufacturer();
		mf.setLocation("Zeeland");
		mf.setName("Samsung");
		mf.setMobilelist(list);
		
		return mf;
	}

}
