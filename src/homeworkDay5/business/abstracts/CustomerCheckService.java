package homeworkDay5.business.abstracts;

import homeworkDay5.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean isPasswordCorrect(Customer customer);
	boolean isEmailCorrect(Customer customer);
	boolean isEmailUsedBefore(Customer customer);
	boolean isFirstNameCorrect(Customer customer);
	boolean isLastNameCorrect(Customer customer);
	boolean isCustomerReady(Customer customer);
	void signUpToSystem(Customer customer);
	
}
