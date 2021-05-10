package homeworkDay5.core;

import homeworkDay5.entities.concretes.Customer;
import homeworkDay5.googleSignUp.GoogleSignUpManager;

public class GoogleSignUpManagerAdapter implements SignUpService{
	
	@Override
	public void signUpWithG(Customer customer) {
		GoogleSignUpManager manager = new GoogleSignUpManager();
		manager.signUpWithGoogle(customer);
		
	}

}
