package guru.springframework.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent>{


	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	
	private PublisherRepository publisherRepository;
	

	public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();		
	}
	
	private void initData() {
		
		Publisher publisher = new Publisher();
		publisher.setName("james");
		publisher.setAddress("London");
		publisherRepository.save(publisher);
		
		
		// author1
		Author author1 = new Author("sachin", "Tendulkar");
		Book book1 = new Book("born to win", "21234567", publisher);
		book1.getAuthors().add(author1);
		author1.getBooks().add(book1);
		
		authorRepository.save(author1);
		bookRepository.save(book1);
		
		
		// author2
		Author author2 = new Author("suresh", "Raina");
		Book book2 = new Book("wines of fire", "4abcd123", publisher);
		author2.getBooks().add(book2);
		author1.getBooks().add(book2);
		
		authorRepository.save(author2);
		bookRepository.save(book2);
		
	}
}
