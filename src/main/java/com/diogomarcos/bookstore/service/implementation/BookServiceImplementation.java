/**
 * {@link BookServiceImplementation}
 */
package com.diogomarcos.bookstore.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diogomarcos.bookstore.dao.BookDaoInterface;
import com.diogomarcos.bookstore.model.Book;
import com.diogomarcos.bookstore.service.BookServiceInterface;

/**
 * @author Diogo Marcos
 *
 */
@Service
public class BookServiceImplementation implements BookServiceInterface {

	@Autowired
	private BookDaoInterface bookDaoInterface;
	
	@Transactional
	public void save(Book book) {
		bookDaoInterface.save(book);
	}

	@Transactional(readOnly = true)
	public List<Book> listBooks() {
		return bookDaoInterface.listBooks();
	}

	@Transactional(readOnly = true)
	public Book getBook(Long id) {
		return bookDaoInterface.getBook(id);
	}

	@Transactional
	public void delete(Long id) {
		bookDaoInterface.delete(id);
	}

}
