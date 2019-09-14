package com.fpt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coin {
    @Id
    private Long id;
    private String name;
    private double baseAsset;
    private double quoteAsset;
    private double lastPrice;
    private double volumn24h;
    private long  marketId_id;
    private long createdAt;
    private long updatedAt;
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(double baseAsset) {
        this.baseAsset = baseAsset;
    }

    public double getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(double quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public double getVolumn24h() {
        return volumn24h;
    }

    public void setVolumn24h(double volumn24h) {
        this.volumn24h = volumn24h;
    }

    public Long getMarketId_id() {
        return marketId_id;
    }

    public void setMarketId_id(Long marketId_id) {
        this.marketId_id = marketId_id;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
