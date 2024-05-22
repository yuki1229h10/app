package com.example.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simple.dao.BookRepository;

/**
 * 書籍に関わる制御
 * @author yuki
 *
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public Iterable findAll() {
		return bookRepository.findAll();
	}

}
