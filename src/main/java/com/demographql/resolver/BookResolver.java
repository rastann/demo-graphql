package com.demographql.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.demographql.entities.Author;
import com.demographql.entities.Book;
import com.demographql.repositories.AuthorRepository;

@Component
public class BookResolver implements GraphQLResolver<Book> {

    private final AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).get();
    }
}
