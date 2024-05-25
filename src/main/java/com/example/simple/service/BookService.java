package com.example.simple.service;

import java.util.List;

import com.example.simple.entity.Book;

/**
 * BookServiceのメソッドを定義するクラス
 * @author yuki
 *
 */
public interface BookService {

	List<Book> findAll();
}
