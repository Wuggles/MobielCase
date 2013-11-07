package mobilebeans;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.MobileDao;

import model.Mobile;

/**
 * Session Bean implementation class MobileBean
 */
@Stateless
public class MobileBean implements MobileBeanLocal {

    @Inject MobileDao mobileDao;
	
    public MobileBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Mobile getMobileByName(String name) {
		return mobileDao.getMobileByName(name);
	}

	@Override
	public List<Mobile> getMobiles() {
		return mobileDao.getAllMobiles();
	}

	@Override
	public void addMobile(Mobile mobile) {
		
		System.out.println("Method not implemented!");
		//mobileDao.addMobile(manufacturer, mobile);
	}

}
