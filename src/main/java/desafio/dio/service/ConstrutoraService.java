package desafio.dio.service;

import desafio.dio.model.Construtora;

public interface ConstrutoraService {

    Iterable<Construtora> buscarTodos();

    Construtora buscarPorId(Long id);

    void inserir(Construtora construtora);

    void atualizar(Long id, Construtora construtora);

    void deletar(Long id);
}
