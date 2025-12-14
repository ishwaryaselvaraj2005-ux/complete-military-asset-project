
package com.military.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Purchase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne private Base base;
    @ManyToOne private Asset asset;
    private Integer quantity;
    private LocalDateTime purchaseDate;
    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public Base getBase(){return base;}
    public void setBase(Base b){this.base=b;}
    public Asset getAsset(){return asset;}
    public void setAsset(Asset a){this.asset=a;}
    public Integer getQuantity(){return quantity;}
    public void setQuantity(Integer q){this.quantity=q;}
    public LocalDateTime getPurchaseDate(){return purchaseDate;}
    public void setPurchaseDate(LocalDateTime d){this.purchaseDate=d;}
}
