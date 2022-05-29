package desafiofinaldio.gft.service;

import desafiofinaldio.gft.model.Construtora;
import desafiofinaldio.gft.repository.ConstrutoraRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class ConstrutoraService {

    @Autowired
    private ConstrutoraRepository construtoraRepository;

    @Autowired
    public ConstrutoraService(ConstrutoraRepository construtoraRepository){
    this.construtoraRepository = construtoraRepository;
    }

    public Construtora salvar(Construtora construtora){
        return construtoraRepository.save(construtora);
    }

}