package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.springframework.spring5webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

	private AuthorRepository authorRepository;
	
	
	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping(method=RequestMethod.GET,value="/authors")
	public String getAuthor(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
		
		
	}
}
