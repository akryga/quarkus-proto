package ru.bearhill.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class ProcessDataTemplate extends PanacheEntity {
    public String name;
    
}
