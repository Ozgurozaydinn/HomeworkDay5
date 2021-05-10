package homeworkDay5.dataAccess.abstracts;

import homeworkDay5.entities.concretes.Customer;

public interface CustomerDao {
	void signUp(Customer customer);
	void signIn(Customer customer);
	
}
