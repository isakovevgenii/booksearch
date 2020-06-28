package com.boots.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_role")
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Role implements GrantedAuthority {
    @Id
    @NonNull
    private Long id;
    @NonNull
    private String name;
    @Transient
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    @Override
    public String getAuthority() {
        return getName();
    }
}
