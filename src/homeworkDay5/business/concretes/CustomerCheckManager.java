package homeworkDay5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import homeworkDay5.business.abstracts.CustomerCheckService;
import homeworkDay5.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {
	
	
	
	public CustomerCheckManager() {
		
	}
	
	@Override
	public boolean isPasswordCorrect(Customer customer) {
		if (customer.getPassword().length()>5) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmailCorrect(Customer customer) {
		String regex =  "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(customer.geteMail());
		return matcher.matches();
		
	}
	
	@Override
	public boolean isEmailUsedBefore(Customer customer) {
		//Database kontrol kodlarý
		return true;
	}

	@Override
	public boolean isFirstNameCorrect(Customer customer) {
		if (customer.getFirstName().length() > 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isLastNameCorrect(Customer customer) {
		if (customer.getLastName().length() > 1) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean isCustomerReady(Customer customer) {
		if (this.isPasswordCorrect(customer) && this.isEmailCorrect(customer) && this.isEmailUsedBefore(customer) && this.isFirstNameCorrect(customer) && this.isLastNameCorrect(customer)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void signUpToSystem(Customer customer) {
		if(this.isCustomerReady(customer)) {
			System.out.println("Eposta onayý gerekiyor. Epostanýzý kontrol ediniz.");
			System.out.println("Kayýt baþarýlý!");
		}else {
			System.out.println("Hatalý bilgi girdiniz. Lütfen bilgilerinizi kontrol ediniz.");
		}
	}

	

}
