package com.debt.system.model;

import java.sql.Date;

public class Pay {
    private Long idPayment;
    private Debt debt;
    private User user;
    private Date paymentDate;
    private double paymentAmount;
    private PaymentStatus status;

    public Pay(Long idPayment, Debt debt, User user, Date paymentDate, double paymentAmount, PaymentStatus status) {
        this.idPayment = idPayment;
        this.debt = debt;
        this.user = user;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.status = status;
    }

    public Long getIdPayment() {
        return idPayment;
    }

    public Debt getDebt() {
        return debt;
    }

    public User getUser() {
        return user;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
    
    
}