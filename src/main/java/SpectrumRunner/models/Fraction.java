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
@Table(name = "fraction")

public class Fraction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name="name" , nullable=false,unique = true)
    private String name;

    @OneToMany(mappedBy = "fraction",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Unit> unit;
}
