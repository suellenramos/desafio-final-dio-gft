package desafio.dio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "saldo_construcao")
public class SaldoConstrucao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="sc_saldo_inicial")
    private BigDecimal saldoInicial;

    @Column(name="sc_saldo_atual")
    private BigDecimal saldoFinal;

    @OneToOne
    @JoinColumn(name = "ob_id")
    private Obras obras;
}






