package desafio.dio.repository;

import desafio.dio.model.Construtora;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstrutoraRepository extends CrudRepository<Construtora, Long> {
}
