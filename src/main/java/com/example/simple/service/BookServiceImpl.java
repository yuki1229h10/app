package com.example.simple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simple.dao.BookRepository;
import com.example.simple.entity.Book;

/**
 * BookServiceのメソッドを実装するクラス
 * @author yuki
 *
 */
@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	@Autowired
	public BookServiceImpl(BookRepository theBookRepository) {
		bookRepository = theBookRepository;
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
}
