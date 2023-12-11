package ru.bearhill.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class ProcessDataTemplate extends PanacheEntity {
    public String name;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    public ProcessTemplate ptpl;
    
}
