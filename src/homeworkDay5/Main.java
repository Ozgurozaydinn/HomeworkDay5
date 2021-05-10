package homeworkDay5;

import java.util.ArrayList;

import homeworkDay5.business.concretes.CustomerCheckManager;
import homeworkDay5.business.concretes.CustomerSignInManager;
import homeworkDay5.business.concretes.CustomerSignUpManager;
import homeworkDay5.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Özgür","Özaydýn","ozgur@gmail.com","123456789");
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		
		CustomerCheckManager manager = new CustomerCheckManager();
		
		System.out.println("Eposta ile kayýt...");
		System.out.println("*******************");
		CustomerSignUpManager signUpManager = new CustomerSignUpManager(manager);
		signUpManager.signUpWithEmail(customer1);
		System.out.println("*******************");
		System.out.println("Google ile kayýt...");
		System.out.println("*******************");
		signUpManager.signUpWithG(customer1);
		System.out.println("*******************");
		System.out.println("Giriþ yapma...");
		System.out.println("*******************");
		CustomerSignInManager signInManager = new CustomerSignInManager();
		signInManager.signIn("ozgur@gmail.com","123456789", customers);
		
		
	}
}