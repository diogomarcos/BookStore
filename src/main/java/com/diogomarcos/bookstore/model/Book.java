/**
 * {@link Book}
 */
package com.diogomarcos.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Diogo Marcos
 *
 */

@Entity
@Table(name = "book")
public class Book {
	
	private Long id;
	private String name;
	private String price;
	private String authors;
	private String isbn;
	private String publisher;
	private String publishedOn;
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	@Column(nullable = false)
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	@Column(length = 10)
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the authors
	 */
	@Column(nullable = false)
	public String getAuthors() {
		return authors;
	}
	/**
	 * @param authors the authors to set
	 */
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	/**
	 * @return the isbn
	 */
	@Column
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the publisher
	 */
	@Column
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the publishedOn
	 */
	@Column(name = "published_date")
	public String getPublishedOn() {
		return publishedOn;
	}
	/**
	 * @param publishedOn the publishedOn to set
	 */
	public void setPublishedOn(String publishedOn) {
		this.publishedOn = publishedOn;
	}
	
	

}
