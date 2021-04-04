package premier.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import premier.spring.services.TodoService;

@Controller
@SessionAttributes({"name","mdp"})
public class TodoController{
	
	@Autowired
	private TodoService todoService;
	
	
	@GetMapping("/liste-todo")
	public String listetodo(Model model) {
		System.out.println("liste "+todoService.retrieveTodos("malik"));
		model.addAttribute("liste", todoService.retrieveTodos("malik"));
		return "liste-todo";
	}
	
	@GetMapping("/add")
	public String addTodo(Model model) {
		System.out.println("on arrive ici");
		return "add";
	}
	
}
