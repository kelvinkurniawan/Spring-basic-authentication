package com.metrodatambkm.security.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long id;

    private String username;

    private String email;

    private String password;

    private List<String> authorities;

    private boolean active;
}
