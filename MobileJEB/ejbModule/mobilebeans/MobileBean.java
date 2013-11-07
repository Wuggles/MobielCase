package mobilebeans;

import java.util.List;

import javax.ejb.Stateless;

import model.Mobile;

/**
 * Session Bean implementation class MobileBean
 */
@Stateless
public class MobileBean implements MobileBeanLocal {

    /**
     * Default constructor. 
     */
    public MobileBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Mobile getMobileByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		
	}

}
