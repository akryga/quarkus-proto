package ru.bearhill.domain;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;

@Entity
@Cacheable
@Table(
        name="User", 
        uniqueConstraints=
            @UniqueConstraint(columnNames={"email"})
    )
public class User extends PanacheEntity {
    
    @NotBlank
    public String email;

    public String firstName;
    public String secondName;
    public String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    public List<ProcessTemplate> ptpl = new ArrayList<ProcessTemplate>();
}
