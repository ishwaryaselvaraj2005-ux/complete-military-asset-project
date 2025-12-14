
package com.military.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Assignment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String personnelName;
    @ManyToOne private Asset asset;
    @ManyToOne private Base base;
    private Integer quantityAssigned;
    private LocalDateTime assignedDate;
    private Boolean returnedOrExpended = false;
    // getters/setters (omitted for brevity)
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getPersonnelName(){return personnelName;}
    public void setPersonnelName(String n){this.personnelName=n;}
    public Asset getAsset(){return asset;}
    public void setAsset(Asset a){this.asset=a;}
    public Base getBase(){return base;}
    public void setBase(Base b){this.base=b;}
    public Integer getQuantityAssigned(){return quantityAssigned;}
    public void setQuantityAssigned(Integer q){this.quantityAssigned=q;}
    public LocalDateTime getAssignedDate(){return assignedDate;}
    public void setAssignedDate(LocalDateTime d){this.assignedDate=d;}
    public Boolean getReturnedOrExpended(){return returnedOrExpended;}
    public void setReturnedOrExpended(Boolean v){this.returnedOrExpended=v;}
}
