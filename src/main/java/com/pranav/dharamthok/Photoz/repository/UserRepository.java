package com.pranav.dharamthok.Photoz.repository;

import com.pranav.dharamthok.Photoz.model.User;
import com.pranav.dharamthok.Photoz.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
 Optional<UserEntity> findByUsername(String username);
 Boolean existsByUsername(String username);  // Corrected from existByUsername to existsByUsername

}
