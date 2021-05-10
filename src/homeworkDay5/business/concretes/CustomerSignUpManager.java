package homeworkDay5.business.concretes;

import homeworkDay5.business.abstracts.CustomerCheckService;
import homeworkDay5.business.abstracts.CustomerSignUpService;
import homeworkDay5.core.SignUpService;
import homeworkDay5.entities.concretes.Customer;
import homeworkDay5.googleSignUp.GoogleSignUpManager;

public class CustomerSignUpManager implements CustomerSignUpService,SignUpService{
	
	private CustomerCheckService customerCheckService;
	
	public CustomerSignUpManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void signUpWithEmail(Customer customer) {
		customerCheckService.signUpToSystem(customer);
	}

	@Override
	public void signUpWithG(Customer customer) {
		GoogleSignUpManager manager = new GoogleSignUpManager();
		manager.signUpWithGoogle(customer);
		
	}


}
