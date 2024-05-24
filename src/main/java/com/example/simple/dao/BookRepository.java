package com.example.simple.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simple.entity.Book;

/**
 * Bookエンティティのためのリポジトリインターフェース。
 * JpaRepositoryを継承しており、基本的なCRUD操作が可能。
 * @author yuki
 *
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
	// ここには何も記述しない
}
