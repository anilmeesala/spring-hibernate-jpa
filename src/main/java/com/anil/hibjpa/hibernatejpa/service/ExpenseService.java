package com.anil.hibjpa.hibernatejpa.service;

import com.anil.hibjpa.hibernatejpa.dto.ExpenseEntity;
import com.anil.hibjpa.hibernatejpa.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public ExpenseEntity addExpense(ExpenseEntity expenseEntity){
        return expenseRepository.save(expenseEntity);
    }

    public List<ExpenseEntity> getCurrentMonthExpenses(){
        return expenseRepository.findAll();
    }
}
