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
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="cli_nome")
    private String nome;

//    @ManyToOne
//    @JoinColumn(nullable = false)
//    private Construtora construtora;

//    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
//    List<Obras> obrasList = new ArrayList<>();
}
