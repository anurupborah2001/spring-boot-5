package com.spring5.demo.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring5.demo.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
