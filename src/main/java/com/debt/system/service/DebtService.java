package com.debt.system.service;

import com.debt.system.model.Debt;
import com.debt.system.model.DebtStatus;
import com.debt.system.repository.DebtRepository;

public class DebtService {
    private final DebtRepository debtRepository;
    
    public DebtService(DebtRepository debtRepository) {
        this.debtRepository = debtRepository;
    }
            
    public void addAmountDebt(Debt debt, double debtAmount) {
        if(debtAmount <= 0) {
            throw new IllegalArgumentException("Invalid Amount!");
        }
        debt.setOutstandingAmount(debt.getOutstandingAmount() + debtAmount);
        debt.setDebtAmount(debtAmount);
        debt.setStatus(DebtStatus.ACTIVE);
        
    }
    
    public void decreaseAmount(Debt debt, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto ingresado debe ser mayor a 0.");
        }
        if (debt.getOutstandingAmount() <= 0) {
            debt.setStatus(DebtStatus.PAID);
            return;
        }
        debt.setOutstandingAmount(debt.getOutstandingAmount() - amount);
        if (debt.getOutstandingAmount() <= 0) {
            debt.setOutstandingAmount(0);
            debt.setStatus(DebtStatus.PAID);
        } else {
            debt.setStatus(DebtStatus.ACTIVE);
        }
    }
    
}
