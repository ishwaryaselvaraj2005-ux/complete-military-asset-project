
package com.military.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transfer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne private Base fromBase;
    @ManyToOne private Base toBase;
    @ManyToOne private Asset asset;
    private Integer quantity;
    private LocalDateTime timestamp;
    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public Base getFromBase(){return fromBase;}
    public void setFromBase(Base b){this.fromBase=b;}
    public Base getToBase(){return toBase;}
    public void setToBase(Base b){this.toBase=b;}
    public Asset getAsset(){return asset;}
    public void setAsset(Asset a){this.asset=a;}
    public Integer getQuantity(){return quantity;}
    public void setQuantity(Integer q){this.quantity=q;}
    public LocalDateTime getTimestamp(){return timestamp;}
    public void setTimestamp(LocalDateTime t){this.timestamp=t;}
}
