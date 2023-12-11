package ru.bearhill.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class ProcessTemplate extends PanacheEntity {
    public String name;
    public String model;
    @ManyToOne
    @JsonIgnore
    public User user;

    @OneToMany(cascade = CascadeType.ALL)
    public List<OperationTemplate> optpl = new ArrayList<OperationTemplate>();

    @OneToMany(cascade = CascadeType.ALL)
    public List<ProcessDataTemplate> pdtpl = new ArrayList<ProcessDataTemplate>();
}
