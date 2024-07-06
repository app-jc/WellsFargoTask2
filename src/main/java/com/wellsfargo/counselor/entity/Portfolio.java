package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;


@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @ManyToOne
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
