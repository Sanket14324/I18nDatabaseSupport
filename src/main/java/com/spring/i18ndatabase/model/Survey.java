package com.spring.i18ndatabase.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "survey")
@Data
public class Survey {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    private String language;


    private String title;

    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Response> responseList;
}
