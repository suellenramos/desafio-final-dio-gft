package desafio.dio.repository;

import desafio.dio.model.Obras;
import org.springframework.data.repository.CrudRepository;

public interface ObrasRepository extends CrudRepository<Obras, Long> {
}
