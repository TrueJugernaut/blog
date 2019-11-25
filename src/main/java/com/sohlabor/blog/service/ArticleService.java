package com.sohlabor.blog.service;

import com.sohlabor.blog.model.Article;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public interface ArticleService {

    Optional<Article> findById(Long id);
}
