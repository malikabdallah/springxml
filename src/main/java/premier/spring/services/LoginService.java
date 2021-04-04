package premier.spring.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean authenticate(String name,String pass) {
		
		if(name.equals("malik")&& pass.equals("malik")) {
			return true;
		}
		return false;
	}

}
