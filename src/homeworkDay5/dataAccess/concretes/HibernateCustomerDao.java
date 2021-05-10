package homeworkDay5.dataAccess.concretes;

import homeworkDay5.dataAccess.abstracts.CustomerDao;
import homeworkDay5.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	@Override
	public void signUp(Customer customer) {
		System.out.println("Yeni kullanýcý kaydý yapýldý : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

	@Override
	public void signIn(Customer customer) {
		System.out.println("Giriþ yapýldý : " + customer.getFirstName() + " " + customer.getLastName());
		
		
	}

}
