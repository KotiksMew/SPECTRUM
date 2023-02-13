package SpectrumRunner.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
@Table(name = "deck")
public class Deck {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="user_id" , nullable=false)
    private long user_id;

    @NotNull
    @Column(name="title" , nullable=false)
    private String title;


}
