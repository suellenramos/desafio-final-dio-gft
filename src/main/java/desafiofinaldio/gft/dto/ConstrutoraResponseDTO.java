package desafiofinaldio.gft.dto;

import desafiofinaldio.gft.model.Construtora;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ConstrutoraResponseDTO {

    private Long id;
    private String descricao;

    public static ConstrutoraResponseDTO modelToDTO(Construtora construtora){
        return new  ConstrutoraResponseDTO(construtora.getId(), construtora.getDescricao());
    }
}
