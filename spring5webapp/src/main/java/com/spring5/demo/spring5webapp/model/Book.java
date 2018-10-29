package com.spring5.demo.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Tolerate;


@Data
@Entity
@Table(name="BOOK")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull private String title;
	@NonNull private String isbn;
	@OneToOne
	@NonNull private Publisher publisher;
	
	//@NonNull private String publisher;
	@ManyToMany
	@JoinTable(
			name="book_author",
			joinColumns=@JoinColumn(name="book_id"),
			inverseJoinColumns=@JoinColumn(name="author_id")
	)
	private Set<Author> authors = new HashSet<Author>();
	@Tolerate
	Book() {}
}
