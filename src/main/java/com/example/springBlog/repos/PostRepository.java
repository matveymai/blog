package com.example.springBlog.repos;

import com.example.springBlog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}
