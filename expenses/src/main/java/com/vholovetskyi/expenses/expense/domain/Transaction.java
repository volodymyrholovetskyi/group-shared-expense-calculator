package com.vholovetskyi.expenses.expense.domain;


import com.vholovetskyi.expenses.commons.BaseEntity;

public class Transaction extends BaseEntity {
    private Long payerId;
    private String name;
    private String category;
    private Money amount;

}
