package desafio.dio.model;

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
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name="ped_quatidade")
    private String quantidade;

    @Column(name="ped_total_material")
    private BigDecimal totalValorMaterial;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "materiais_pedido",
        joinColumns = @JoinColumn(name = "mat_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "ped_id", referencedColumnName = "id"))
    private List<CotacaoMateriais> cotacaoMateriaisList;

}
