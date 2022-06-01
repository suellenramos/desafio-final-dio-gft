package desafio.dio.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "construtora")
public class Construtora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cons_descricao")
    private String descricao;

    @OneToMany(mappedBy = "construtora")
    List<Cliente> cLientes;

    @OneToOne
    Endereco enderecos;
}
