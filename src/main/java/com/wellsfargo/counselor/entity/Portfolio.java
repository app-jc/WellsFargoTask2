package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "portfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private Long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Constructors
    public Portfolio() {
    }

    public Portfolio(Client client) {
        this.client = client;
    }

    // Getters and Setters
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
