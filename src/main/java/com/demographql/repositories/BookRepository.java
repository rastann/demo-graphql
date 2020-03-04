package com.demographql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demographql.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
