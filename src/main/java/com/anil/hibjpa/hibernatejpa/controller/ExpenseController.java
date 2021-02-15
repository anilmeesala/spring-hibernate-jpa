package com.anil.hibjpa.hibernatejpa.controller;

import com.anil.hibjpa.hibernatejpa.dto.ExpenseEntity;
import com.anil.hibjpa.hibernatejpa.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ExpenseController {
    @Autowired
    ExpenseService expenseService;

    @GetMapping("/getAllExpenses")
    public List<ExpenseEntity> getAllExpenses(){
        return expenseService.findAll();
    }

    @PostMapping("/saveExpense")
    public ExpenseEntity saveExpense(@RequestBody ExpenseEntity expenseEntity){
        System.out.println(expenseEntity);
        return expenseService.save(expenseEntity);
    }
}
