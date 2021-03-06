package com.spring5.demo.spring5webapp.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.experimental.Tolerate;

@Data
@EqualsAndHashCode(exclude="books")
@Entity
@Table(name="AUTHOR")
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull private String firstName;
	@NonNull private String lastName;
	@ManyToMany(mappedBy="authors")
	private Set<Book> books = new HashSet<Book>();
	@Tolerate
	Author() {}
}
