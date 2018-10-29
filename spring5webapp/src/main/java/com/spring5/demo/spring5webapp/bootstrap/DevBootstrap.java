package com.spring5.demo.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.spring5.demo.spring5webapp.model.Author;
import com.spring5.demo.spring5webapp.model.Book;
import com.spring5.demo.spring5webapp.model.Publisher;
import com.spring5.demo.spring5webapp.repositories.AuthorRepository;
import com.spring5.demo.spring5webapp.repositories.BookRepository;
import com.spring5.demo.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private AuthorRepository authorRepo;
	@Autowired
	private BookRepository bookRepo;
	@Autowired
	private PublisherRepository publishRepo;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
	}
	
	public void initData() {
		Publisher publisher1 = new Publisher("Hasper","Hasper2345");
		publishRepo.save(publisher1);
		
		Author author1 = new Author("Eric","Evans");
		Book book1 = new Book("Domain Driven Design","1234",publisher1);
		author1.getBooks().add(book1);
		book1.getAuthors().add(author1);
		authorRepo.save(author1);
		bookRepo.save(book1);
		
		
		Publisher publisher2 = new Publisher("Worx","Worx345");
		publishRepo.save(publisher2);
		
		Author author2 = new Author("Rod","Johnson");
		Book book2 = new Book("J2EE Developemet with Spring Data","2444",publisher2);
		author2.getBooks().add(book2);
		book2.getAuthors().add(author2);
		authorRepo.save(author2);
		bookRepo.save(book2);
	}

}
