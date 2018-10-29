/**
 * 
 */
package com.spring5.demo.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring5.demo.spring5webapp.model.Book;

/**
 * @author Anurup Borah
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
