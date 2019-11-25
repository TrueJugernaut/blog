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
package com.sohlabor.blog.service;

import com.sohlabor.blog.model.Article;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * @author Follett Software Company
 * @copyright 2017
 */

@Service
public interface ArticleService {

    Optional<Article> findById(Long id);
}
