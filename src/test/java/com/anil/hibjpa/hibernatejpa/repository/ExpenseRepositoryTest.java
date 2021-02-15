package com.anil.hibjpa.hibernatejpa.repository;

import com.anil.hibjpa.hibernatejpa.dto.Category;
import com.anil.hibjpa.hibernatejpa.dto.ExpenseEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ExpenseRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private ExpenseRepository expenseRepository;

    @Test
    void findAllByExpenseDateGreaterThanEqualAndExpenseDateLessThanEqual() {
        ExpenseEntity    expenseEntity = ExpenseEntity.builder().id(1l)
                .name("test1").location("loc1").expenseDate(new Date())
                .createdDate(new Date()).modifiedDate(new Date())
                .amount(new BigDecimal(100)).category(Category.GROCERY).build();
        testEntityManager.persist(expenseEntity);
        testEntityManager.flush();
        List<ExpenseEntity> all = expenseRepository.findAll();
        for (ExpenseEntity e:all) {
            System.out.println(e);
        }
    }
}