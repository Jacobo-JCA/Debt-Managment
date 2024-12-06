package com.debt.system.model;

import java.sql.Date;
import java.util.Objects;

public class Debt {
    private Long idDebt;
    private double debtAmount;
    private double outstandingAmount;
    private Date initialLoanDate;
    private Date expirationDate;
    private double interest;
    private DebtStatus status;
    private User user;

    public Debt() {
    }

    public Debt(Long idDebt, double debtAmount, Date initialLoanDate, Date expirationDate, 
                double interest, DebtStatus status, User user) {
        this.idDebt = idDebt;
        this.debtAmount = debtAmount;
        this.outstandingAmount = debtAmount;
        this.initialLoanDate = initialLoanDate;
        this.expirationDate = expirationDate;
        this.interest = interest;
        this.status = status;
        this.user = user;
    }

    public Long getIdDebt() {
        return idDebt;
    }

    public double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public double getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(double outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public Date getInitialLoanDate() {
        return initialLoanDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        if(this.expirationDate.before(expirationDate)) {
            throw new IllegalArgumentException("Enter a date later than the current date");
        }
        try {
            this.expirationDate = expirationDate;
        } catch(IllegalArgumentException e) {
            throw new IllegalArgumentException("The date format is incorrect" + e.getMessage());
        }
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public DebtStatus getStatus() {
        return status;
    }

    public void setStatus(DebtStatus status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.idDebt);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Debt other = (Debt) obj;
        return Objects.equals(this.idDebt, other.idDebt);
    }

    @Override
    public String toString() {
        return "Debt{" + "idDebt=" + idDebt + ", debtAmount=" + debtAmount 
                + ", outstandingAmount=" + outstandingAmount + ", initialLoanDate=" 
                + initialLoanDate + ", expirationDate=" + expirationDate + ", interest=" 
                + interest + ", status=" + status + ", user=" + user + '}';
    }
}
