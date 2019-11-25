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
package com.sohlabor.blog.repository;

import com.sohlabor.blog.model.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Follett Software Company
 * @copyright 2017
 */

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
