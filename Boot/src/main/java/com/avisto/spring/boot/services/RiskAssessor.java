package com.avisto.spring.boot.services;

import org.springframework.stereotype.Service;

@Service
public class RiskAssessor {
    private String valeur;

    public RiskAssessor() {
        valeur = "coucou!";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RiskAssessor [valeur=" + valeur + "]";
    }

    /**
     * @return the valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * @param paramValeur the valeur to set
     */
    public void setValeur(String paramValeur) {
        valeur = paramValeur;
    }
    
}
