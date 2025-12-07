package com.chainsys.tradingapp.dto;

public abstract class BaseStockDTO {
    private int stockId;
    private String symbol;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    }

    }
}
