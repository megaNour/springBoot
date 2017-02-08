package com.avisto.spring.boot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseAccountService {
    private final RiskAssessor riskAssessor;
    
    @Autowired
    public DatabaseAccountService(RiskAssessor riskAssessor) {
        this.riskAssessor = riskAssessor;
    }
    
    public String direBonjour() {
        return riskAssessor.getValeur();
    }
}
