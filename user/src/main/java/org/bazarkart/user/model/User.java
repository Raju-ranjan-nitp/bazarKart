package org.bazarkart.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
   @Id
    private Long userId;
    private String userName;
    private String password;
    private String role;
}
