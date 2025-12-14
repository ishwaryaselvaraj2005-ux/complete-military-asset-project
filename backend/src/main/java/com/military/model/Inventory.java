
package com.military.model;

import jakarta.persistence.*;

@Entity
public class Inventory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Base base;
    @ManyToOne
    private Asset asset;
    private Integer openingBalance = 0;
    private Integer closingBalance = 0;
    private Integer netMovement = 0;
    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public Base getBase(){return base;}
    public void setBase(Base b){this.base=b;}
    public Asset getAsset(){return asset;}
    public void setAsset(Asset a){this.asset=a;}
    public Integer getOpeningBalance(){return openingBalance;}
    public void setOpeningBalance(Integer v){this.openingBalance=v;}
    public Integer getClosingBalance(){return closingBalance;}
    public void setClosingBalance(Integer v){this.closingBalance=v;}
    public Integer getNetMovement(){return netMovement;}
    public void setNetMovement(Integer v){this.netMovement=v;}
}
