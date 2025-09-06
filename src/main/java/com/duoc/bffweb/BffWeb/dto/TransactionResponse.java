package com.duoc.bffweb.BffWeb.dto;

public class TransactionResponse {
    private Long id;
    private String transactionDate;
    private Integer amount;
    private String type;
    
    public TransactionResponse() {}
    
    public TransactionResponse(Long id, String transactionDate, Integer amount, String type) {
        this.id = id;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.type = type;
    }
    
    // Getters y Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTransactionDate() {
        return transactionDate;
    }
    
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    public Integer getAmount() {
        return amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
