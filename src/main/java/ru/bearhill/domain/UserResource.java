package ru.bearhill.domain;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface UserResource extends PanacheEntityResource<User, Long> {
    
}
