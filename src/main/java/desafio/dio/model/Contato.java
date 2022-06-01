package desafio.dio.model;

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
@Table(name = "contato")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="cli_nome")
    private String nome;

    @Column(name="cont_telefone")
    private String telefone;

    @Column(name="cont_email")
    private String email;

//    @ManyToOne
//    @JoinColumn(nullable = false)
//    private Construtora construtora;

}
