package com.anil.hibjpa.hibernatejpa.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class CategoryEntity {

    @Id
    private Long id;
    @Column(name="name")
    private Category category;

}
