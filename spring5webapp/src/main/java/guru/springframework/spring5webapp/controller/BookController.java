package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.springframework.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {

	
	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping(value="/books", method=RequestMethod.GET)
	public String  getBooks(Model model)
	{
		model.addAttribute("books", bookRepository.findAll());
		
		return "books";
	}
}
