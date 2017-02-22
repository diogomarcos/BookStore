/**
 * {@link BookDaoImplementation}
 */
package com.diogomarcos.bookstore.dao.implementation;

import java.util.List;

import javax.persistence.OrderBy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.diogomarcos.bookstore.dao.BookDaoInterface;
import com.diogomarcos.bookstore.model.Book;

/**
 * @author Diogo Marcos
 *
 */
@Repository
public class BookDaoImplementation implements BookDaoInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Book book) {
		getSession().merge(book);
		
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<Book> listBooks() {
		return getSession().createCriteria(Book.class).addOrder(Order.asc("name")).list();
	}

	public Book getBook(Long id) {
		return (Book) getSession().get(Book.class, id);
	}

	public void delete(Long id) {
		Book book = getBook(id);
		
		if (null != book) {
			getSession().delete(book);
		}
		
	}
	
	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
