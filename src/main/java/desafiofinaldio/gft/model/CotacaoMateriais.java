package desafiofinaldio.gft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "cotacao_materiais")
public class CotacaoMateriais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="mat_descricao")
    private String descricao;

    @Column(name="mat_valor")
    private BigDecimal valor;

    @ManyToMany(mappedBy = "cotacaoMateriaisList")
    private List<Pedido> pedidos;
}
