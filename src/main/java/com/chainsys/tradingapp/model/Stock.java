package com.chainsys.tradingapp.model;

import com.chainsys.tradingapp.dto.BaseStockDTO;

public class Stock extends BaseStockDTO {
    private double currentStockPrice;
    private String capCategory;

        super(); // Initialize base class
        this.setStockId(stockId);
        this.setSymbol(symbol);
        this.currentStockPrice = currentStockPrice;
        this.capCategory = capCategory;
    }

    public double getCurrentStockPrice() {
        return currentStockPrice;
    }

    public void setCurrentStockPrice(double currentStockPrice) {
        this.currentStockPrice = currentStockPrice;
    }

    public String getCapCategory() {
        return capCategory;
    }

    public void setCapCategory(String capCategory) {
        this.capCategory = capCategory;
    }
}
