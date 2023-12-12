package ru.bearhill.domain;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class ProcessTemplate extends PanacheEntity {
    public String name;
    public String model;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="optpl_id")
    public List<OperationTemplate> optpl = new ArrayList<OperationTemplate>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="pdtpl_id")
    public List<ProcessDataTemplate> pdtpl = new ArrayList<ProcessDataTemplate>();
}
