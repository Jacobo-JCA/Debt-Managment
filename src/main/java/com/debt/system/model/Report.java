package com.debt.system.model;

import java.sql.Date;

public class Report {
    private Long idReport;
    private Date generationDate;
    private double totalIncome;
    private double totalOutstandingDebt;
    private double totalDebtPaid;
    private double totalPaymentsMade;
    private double balanceSheet;
    private Income income;
    private Debt debt;
    private Pay pay;

    public Report() {
    }

    public Report(Long idReport, Date generationDate, double totalIncome, double totalOutstandingDebt, 
            double totalDebtPaid, double totalPaymentsMade, double balanceSheet, Income income, Debt debt, Pay pay) {
        this.idReport = idReport;
        this.generationDate = generationDate;
        this.totalIncome = totalIncome;
        this.totalOutstandingDebt = totalOutstandingDebt;
        this.totalDebtPaid = totalDebtPaid;
        this.totalPaymentsMade = totalPaymentsMade;
        this.balanceSheet = balanceSheet;
        this.income = income;
        this.debt = debt;
        this.pay = pay;
    }
    
    
}
