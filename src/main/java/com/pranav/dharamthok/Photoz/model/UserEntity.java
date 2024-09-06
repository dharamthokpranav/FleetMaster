package com.pranav.dharamthok.Photoz.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users") // Maps this class to the "users" collection in MongoDB
public class UserEntity {

    @Id
    private String id; // MongoDB typically uses a String type for IDs
    private String username;
    private String password;

    @DBRef
    private List<Roles> roles;

}
