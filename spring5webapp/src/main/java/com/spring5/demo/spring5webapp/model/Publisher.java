package com.spring5.demo.spring5webapp.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;
import lombok.NonNull;
import lombok.experimental.Tolerate;

@Data
@Entity
@Table(name="PUBLISHER")
public class Publisher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull private String name;
	@NonNull private String address;
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="publisher") 
	private Book book;
	
	@Tolerate
	Publisher() {}
}
