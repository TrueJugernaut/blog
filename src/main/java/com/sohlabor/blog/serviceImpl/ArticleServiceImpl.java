/*
 * ====================================================================
 *
 * Follett Software Company
 *
 * Copyright (c) 2019 Follett Software Company
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, is not permitted without a written agreement
 * from Follett Software Company.
 *
 * ====================================================================
 */
package com.sohlabor.blog.serviceImpl;

import com.sohlabor.blog.model.Article;
import com.sohlabor.blog.repository.ArticleRepository;
import com.sohlabor.blog.service.ArticleService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Follett Software Company
 * @copyright 2017
 */

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }
}
