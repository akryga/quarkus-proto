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
public class OperationTemplate extends PanacheEntity {
    public String name;
    public String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="opdtpl_id")
    public List<OperationDataTemplate> opdtpl = new ArrayList<OperationDataTemplate>();
}
