package com.tts.blogpost.controller;

import com.tts.blogpost.domain.BlogPost;
import com.tts.blogpost.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping(value="/")
    public String index(BlogPost blogPost, Model model){
        Iterable<BlogPost> posts= blogPostRepository.findAll();
        model.addAttribute("posts", posts);
        return "blogpost/index";
    }
    @GetMapping(value = "/blogposts/new")
    public String newBlog (BlogPost blogPost) {
        return "blogpost/new";
    }

    @RequestMapping(value = "/blogposts/{id}")
    public String deletePostWithId(@PathVariable(value="id") Long id, BlogPost blogPost) {
        blogPostRepository.deleteById(id);
        return "redirect:/";
    }
    @PostMapping(value="/blogposts")
    public String addNewBlogPost(BlogPost blogPost, Model model){
        blogPostRepository.save(blogPost);
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }

}
