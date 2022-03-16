package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "khong duoc de trong")
    @Size(min = 4,max = 60,message ="ten phai tư 4-60 ki tu" )
    private String firstName;
    @NotEmpty
    @Size(min = 0,max = 60)
    private String lastName;

    @ManyToOne(targetEntity = Province.class)
    private Province province;


}
