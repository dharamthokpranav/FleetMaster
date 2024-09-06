package com.pranav.dharamthok.Photoz.repository;

import com.pranav.dharamthok.Photoz.model.Roles;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Roles, String> {
    Optional<Roles> findByName(String name);

}
