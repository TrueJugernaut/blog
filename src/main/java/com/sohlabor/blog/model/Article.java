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
package com.sohlabor.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Follett Software Company
 * @copyright 2017
 */

@Entity
@NoArgsConstructor
@Getter @Setter
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String title;

    @Column
    private String announce;

    @Column
    private Long views;

    @Column
    private String content;
}
