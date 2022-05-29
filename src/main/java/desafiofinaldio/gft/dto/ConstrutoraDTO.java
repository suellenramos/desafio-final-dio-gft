package desafiofinaldio.gft.dto;

import desafiofinaldio.gft.model.Construtora;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class ConstrutoraDTO implements Serializable {

    private String descricao;

    public Construtora dtoToModel(){
        return  new Construtora(descricao);
    }

}
