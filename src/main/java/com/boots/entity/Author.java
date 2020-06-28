package com.boots.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "t_author")
@Setter
@Getter
public class Author {
    @Id
    private Long id;
    private String name;
    private Date birthDay;
    private Date deathDay;
    private String country;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Book> books;
}
