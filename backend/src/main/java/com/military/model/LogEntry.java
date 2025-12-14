
package com.military.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LogEntry {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String actionType;
    private String username;
    private LocalDateTime timestamp;
    @Column(length=1000)
    private String description;
    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getActionType(){return actionType;}
    public void setActionType(String a){this.actionType=a;}
    public String getUsername(){return username;}
    public void setUsername(String u){this.username=u;}
    public LocalDateTime getTimestamp(){return timestamp;}
    public void setTimestamp(LocalDateTime t){this.timestamp=t;}
    public String getDescription(){return description;}
    public void setDescription(String d){this.description=d;}
}
