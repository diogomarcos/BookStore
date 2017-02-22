/**
 * {@link BookController}
 */
package com.diogomarcos.bookstore.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.diogomarcos.bookstore.model.Book;
import com.diogomarcos.bookstore.service.BookServiceInterface;

/**
 * @author Diogo Marcos
 *
 */
@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookServiceInterface bookServiceInterface;

	@RequestMapping(value = { "/", "/listBooks" })
	public String listBooks(Map<String, Object> map) {

		map.put("book", new Book());
		map.put("bookList", bookServiceInterface.listBooks());

		return "/book/listBooks";
	}

	@RequestMapping("/get/{bookId}")
	public String getBook(@PathVariable Long bookId, Map<String, Object> map) {

		Book book = bookServiceInterface.getBook(bookId);

		map.put("book", book);

		return "/book/bookForm";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book,
			BindingResult result) {

		bookServiceInterface.save(book);

		return "redirect:listBooks";
	}

	@RequestMapping("/delete/{bookId}")
	public String deleteBook(@PathVariable("bookId") Long id) {

		bookServiceInterface.delete(id);

		return "redirect:/book/listBooks";
	}
}
