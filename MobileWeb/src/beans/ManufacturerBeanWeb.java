package beans;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import mobilebeans.ManufacturerBeanLocal;
import model.Manufacturer;

@ManagedBean(name="manufacturer")
@RequestScoped
public class ManufacturerBeanWeb {
	
	
	@EJB(mappedName="manufacturerBean")
	private ManufacturerBeanLocal manBean;
	
	private String name;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public ManufacturerBeanWeb() {
	}
	
	public void save() {
//		InitialContext ic = null;
//		ManufacturerBeanLocal manBean = null;
//		try {
//			ic = new InitialContext();
//			manBean = (ManufacturerBeanLocal) ic.lookup("java:global/MobileCaseEAR/MobileJEB/ManufacturerBean");
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Fout Harry");
//			e.printStackTrace();
//		}
//		
//		
		
		Manufacturer man = null;
		if(name != null && location != null) {
			man = new Manufacturer();
			man.setLocation(location);
			man.setName(name);
			manBean.addManufacturer(man);
		}
//		
//		manBean.addManufacturer(man);
		
		System.out.println("Man name: " + name);
	}
	
	

}
