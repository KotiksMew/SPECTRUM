package SpectrumRunner.models;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
@Data
@NoArgsConstructor
@Entity
@Table(name = "user")

public class User{
    @Id
    @GeneratedValue(strategy= GenerationType.)
    private long id;

    @NotNull
    @Column(name="nickname" , nullable=false,unique = true)
    private String nickname;

    @NotNull
    @Column(name="email" , nullable=false,unique = true)
    private String email;

    @NotNull
    @Column(name="password" , nullable=false)
    private String password;

    @NotNull
    @Column(name="role" , nullable=false)
    private String role;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Deck> deck;

}
