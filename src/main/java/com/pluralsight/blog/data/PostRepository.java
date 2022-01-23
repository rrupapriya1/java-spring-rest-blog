package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.pluralsight.blog.model.Post;

@Repository

public interface PostRepository extends JpaRepository<Post, Long>{

	@RestResource(rel="contains-title", path="containsTitle")
	List findByTitleContaining(String text);
	
	List<Post> findByAuthor_Lastname(String lastName);
}
