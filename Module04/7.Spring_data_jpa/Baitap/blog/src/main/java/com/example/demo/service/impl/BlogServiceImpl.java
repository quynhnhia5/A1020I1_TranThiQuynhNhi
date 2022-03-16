package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.repository.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl  implements BlogService {

    @Autowired
    BlogRepository blogRepository;
    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void deleteBlog(int id) {
        blogRepository.deleteById(id);

    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }
}
