package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Manufacturer;
import model.Mobile;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDataAccess {
	
	private EntityManagerFactory emf;
	private EntityManager em;

	@Before
	public void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("default");
		em = emf.createEntityManager();
	}

	@After
	public void tearDown() throws Exception {
		em.close();
		em = emf.createEntityManager();
	}

	@Test
	public void test() {
		createMobile();
		Manufacturer mf = em.find(Manufacturer.class, "Samsung");
		assertThat(mf.getName(), is("Samsung"));
		assertThat(mf.getMobilelist().get(0).getName(), is("Galaxy S2plus"));
		assertThat(mf.getMobilelist().get(0).getPrice(), is(120.99));
	}
	
	private void createMobile() {
		em.getTransaction().begin();
		
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
		
		em.persist(mf);
		em.getTransaction().commit();
	}

}
