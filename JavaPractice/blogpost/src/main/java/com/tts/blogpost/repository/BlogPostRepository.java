package com.tts.blogpost.repository;

import com.tts.blogpost.domain.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

}
