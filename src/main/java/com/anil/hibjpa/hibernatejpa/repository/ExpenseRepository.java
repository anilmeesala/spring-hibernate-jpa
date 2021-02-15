package com.anil.hibjpa.hibernatejpa.repository;

import com.anil.hibjpa.hibernatejpa.dto.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Long> {
    List<ExpenseEntity> findAllByExpenseDateGreaterThanEqualAndExpenseDateLessThanEqual(Date startDate, Date endDate);

}
