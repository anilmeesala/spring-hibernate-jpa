package com.anil.hibjpa.hibernatejpa.dto;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class CategoryEntity {

    private Long id;
    private Category category;

}
