package homeworkDay5.business.abstracts;


import java.util.ArrayList;

import homeworkDay5.entities.concretes.Customer;

public interface CustomerSignInService {
	void signIn(String eMail, String password, ArrayList<Customer> customers);
}
