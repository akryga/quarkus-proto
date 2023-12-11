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
public class OperationTemplate extends PanacheEntity {
    public String name;
    public String description;

    @JsonIgnore
    @ManyToOne
    public ProcessTemplate ptpl;

    @OneToMany(cascade = CascadeType.ALL)
    public List<OperationDataTemplate> opdtpl = new ArrayList<OperationDataTemplate>();
}
