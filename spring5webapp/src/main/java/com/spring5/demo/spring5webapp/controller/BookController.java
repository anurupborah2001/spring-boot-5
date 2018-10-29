package com.spring5.demo.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring5.demo.spring5webapp.repositories.BookRepository;

@Controller
@RequestMapping(path="/")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;

	@GetMapping(path="books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}
}
