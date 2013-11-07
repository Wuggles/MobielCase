package beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import mobilebeans.MobileBeanLocal;
import model.Mobile;

/**
 * Session Bean implementation class MobileBean
 */
@ManagedBean(name="mobile")
@RequestScoped
public class MobileBeanWeb {

	private String name;
	private double price;
	private String size;
	
	public MobileBeanWeb() {
		name = "Sony S1";
		price = 200.20;
		size = "15mm x 5mm";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public void saveMobile() throws NamingException {
		InitialContext ic = new InitialContext();
		MobileBeanLocal mobileBean = (MobileBeanLocal) ic.lookup("java:global/MobileCaseEAR/MobileJEB/MobileBean!mobilebeans.MobileBeanLocal");
		Mobile mobile = new Mobile();
		mobile.setName(name);
		mobile.setPrice(price);
		mobile.setSize(size);
		
		mobileBean.addMobile(mobile);
	}
	
	

}
