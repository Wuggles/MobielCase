package mobilebeans;

import java.util.List;

import javax.ejb.Remote;

import model.Mobile;

@Remote
public interface MobileBeanLocal {
	
	public Mobile getMobileByName(String name);
	public List<Mobile> getMobiles();
	public void addMobile(Mobile mobile);
	
}
