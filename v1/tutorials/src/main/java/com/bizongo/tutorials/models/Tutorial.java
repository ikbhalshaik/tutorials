package com.bizongo.tutorials.models;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@ToString
@Entity
@Table
//@Table(name="tutorials")
public class Tutorial {
    @Getter
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Setter
    @Getter
//    @Column(name="title")
    private String title;

    @Setter
    @Getter
//    @Column(name="url")
    private String url;
}
