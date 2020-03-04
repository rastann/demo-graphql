package com.demographql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demographql.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
