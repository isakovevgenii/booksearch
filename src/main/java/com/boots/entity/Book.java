package com.boots.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "t_book")
@Setter
@Getter
public class Book {
    @Id
    private Long id;
    private String name;
    private String description;
    private Date date;
    private String country;
    private String genre;

    @ManyToMany(mappedBy = "books")
    private Set<Author> author;
}
