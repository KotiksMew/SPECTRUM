package SpectrumRunner.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "unit")

public class Unit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name="name" , nullable=false,unique = true)
    private String name;

    @Column(name="fraction_id" , nullable=false,unique = true)
    private long fraction_id;

    @Column(name="rating" , nullable=false,unique = true)
    private long rating;

    @Column(name="img" , nullable=false,unique = true)
    private byte[] img;                                       //magic?

    @Column(name="info" , nullable=false,unique = true)
    private String info;

    @ManyToMany(targetEntity = Unit.class,cascade =CascadeType.ALL)
    @JoinTable(name="deck_unit",joinColumns=@JoinColumn(name="deck_id"),
            inverseJoinColumns = @JoinColumn(name="unit_id"))
    private List<Unit>unit;
}