package com.pranav.dharamthok.Photoz.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "roles") // Maps this class to the "users" collection in MongoDB
public class Roles {
    @Id
    private String id;
    private String name;
}



