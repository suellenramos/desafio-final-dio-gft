package desafiofinaldio.gft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "construtora")
public class Construtora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cons_descricao")
    private String descricao;

    @OneToMany(mappedBy = "construtora", cascade = CascadeType.ALL)
    List<Cliente> cLientes = new ArrayList<>();

    public Construtora(String descricao){
        this.descricao = descricao;
    }
}
