package ru.bearhill.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class OperationDataTemplate extends PanacheEntity{
    
    public String name;

    @ManyToOne
    @JsonIgnore
    public OperationTemplate optpl;
}
