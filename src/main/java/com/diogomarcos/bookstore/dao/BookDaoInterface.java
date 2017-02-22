/**
 * {@link BookDaoInterface}
 */
package com.diogomarcos.bookstore.dao;

import java.util.List;

import com.diogomarcos.bookstore.model.Book;

/**
 * @author Diogo Marcos
 *
 */
public interface BookDaoInterface {
	
	public void save(Book book);
	
	public List<Book> listBooks();
	
	public Book getBook(Long id);
	
	public void delete(Long id);
}
