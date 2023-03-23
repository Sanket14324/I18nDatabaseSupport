package com.spring.i18ndatabase.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "response")
@Data
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question;

    private String answer;


    @ManyToOne(cascade = CascadeType.ALL)
    private Survey survey;
}
