/**
 * {@link BookServiceInterface}
 */
package com.diogomarcos.bookstore.service;

import java.util.List;

import com.diogomarcos.bookstore.model.Book;

/**
 * @author Diogo Marcos
 *
 */
public interface BookServiceInterface {

	public void save(Book book);
	
	public List<Book> listBooks();
	
	public Book getBook(Long id);
	
	public void delete(Long id);
}
