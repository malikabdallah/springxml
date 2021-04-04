package premier.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import premier.spring.services.LoginService;

@Controller
@SessionAttributes({"name","mdp"})
public class LoginController {

	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String welcome(@RequestParam String name,@RequestParam String mdp,
			Model model) {
		
		if(!loginService.authenticate(name, mdp)) {
			model.addAttribute("errorMessage", "authentification echoue");
			return "login";
		}
		model.addAttribute("name", name);
		return "welcome";
	}
	
}
