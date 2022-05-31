package desafio.dio.integracao.viacep.repository;

import desafio.dio.integracao.viacep.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
