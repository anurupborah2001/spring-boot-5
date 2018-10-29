/**
 * 
 */
package com.spring5.demo.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring5.demo.spring5webapp.model.Publisher;

/**
 * @author Anurup Borah
 *
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
