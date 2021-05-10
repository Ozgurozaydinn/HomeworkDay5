package homeworkDay5.business.concretes;

import homeworkDay5.entities.concretes.Customer;

import java.util.ArrayList;


import homeworkDay5.business.abstracts.CustomerSignInService;

public class CustomerSignInManager implements CustomerSignInService {

	@Override
	public void signIn(String eMail, String password, ArrayList<Customer> customers) {
		for (Customer customer : customers) {
			if (customer.geteMail()== eMail && customer.getPassword() == password) {
				System.out.println("Giri� Ba�ar�l�!");
			}else {
			System.out.println("Kullan�c� bulunamad�! L�tfen bilgilerinizi kontrol ediniz.");
			}
		}
		
	}

}
