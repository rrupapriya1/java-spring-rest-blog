package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.blog.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

	
	List<Author> findByLastname(String lastName);
}
