package homeworkDay5.googleSignUp;

import homeworkDay5.entities.concretes.Customer;

public class GoogleSignUpManager {
	public void signUpWithGoogle(Customer customer) {
		System.out.println("Google ile üye olma baþarýlý : " + customer.getFirstName() + " " + customer.getLastName());
	}
}
