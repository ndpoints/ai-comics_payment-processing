package com.ai.comics.model;

import java.time.LocalDateTime;

public class Transaction {
    private Integer transactionId;
    private Integer userId;
    private Double amount;
    private String currency;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + toIndentedString(transactionId) +
                ", userId=" + toIndentedString(userId) +
                ", amount=" + toIndentedString(amount) +
                ", currency='" + toIndentedString(currency) + '\'' +
                ", status='" + toIndentedString(status) + '\'' +
                ", createdAt=" + toIndentedString(createdAt) +
                ", updatedAt=" + toIndentedString(updatedAt) +
                '}';
    }

    private String toIndentedString(Object value) {
        if (value == null) {
            return "null";
        }
        return value.toString().replace("\n", "\n    ");
    }
}