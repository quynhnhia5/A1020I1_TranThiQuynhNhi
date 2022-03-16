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
@Table(name = "song")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty
    @Size(max = 800)
    @Pattern(regex =( '^[a-zA-Z0-9\+]*$'))
    private String nameSong;

    private String artist;

    private String Type;


}
