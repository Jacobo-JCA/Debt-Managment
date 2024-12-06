package com.debt.system.service;

import com.debt.system.repository.PayRepository;

public class PayService {
    private final PayRepository payRepository;
    
    public PayService(PayRepository payRepository) {
        this.payRepository = payRepository;
    }
    
    
}
