package com.anil.hibjpa.hibernatejpa.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@Entity
public class ExpenseEntity {

    private Long id;
    private String name;
    private String location;
    private Date expenseDate;
    private Date createdDate;
    private Date modifiedDate;
    private BigDecimal amount;
    private Category category;

}
