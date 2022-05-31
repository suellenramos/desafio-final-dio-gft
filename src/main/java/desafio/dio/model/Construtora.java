package desafio.dio.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "construtora")
public class Construtora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cons_descricao")
    private String descricao;

//    @OneToMany(mappedBy = "construtora", cascade = CascadeType.ALL)
//    List<Cliente> cLientes = new ArrayList<>();

}
