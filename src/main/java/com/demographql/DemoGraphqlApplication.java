package com.demographql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demographql.entities.Author;
import com.demographql.entities.Book;
import com.demographql.repositories.AuthorRepository;
import com.demographql.repositories.BookRepository;

@SpringBootApplication
public class DemoGraphqlApplication {

	@Bean
	public CommandLineRunner demo(AuthorRepository authorRepository, BookRepository bookRepository) {
		return (args) -> {
			Author author = new Author("Herbert", "Schildt");
			authorRepository.save(author);

			bookRepository.save(new Book("Java: A Beginner's Guide, Sixth Edition", "0071809252", 728, author));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoGraphqlApplication.class, args);
	}

}
