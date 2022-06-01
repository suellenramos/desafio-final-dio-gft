package desafio.dio.service;

import desafio.dio.model.Construtora;
import desafio.dio.model.Endereco;
import desafio.dio.repository.ConstrutoraRepository;
import desafio.dio.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConstrutoraServiceImpl {

    @Autowired
    private ConstrutoraRepository construtoraRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private CepService cepService;



    public Iterable<Construtora> buscarTodos() {
        return construtoraRepository.findAll();
    }


    public void inserir(Construtora construtora) {
        salvarConstrutoraComCep(construtora);
    }

    public void atualizar(Long id, Construtora construtora) {
        Optional<Construtora> construtorabd = construtoraRepository.findById(id);
        if (construtorabd.isPresent()) {
            salvarConstrutoraComCep(construtora);
        }
    }

    public void deletar(Long id) {
        construtoraRepository.deleteById(id);
    }

    private void salvarConstrutoraComCep(Construtora construtora) {
        String cep = construtora.getEnderecos().getCep();
        Endereco endereco = enderecoRepository.findById(Long.valueOf(cep)).orElseGet(() -> {
            Endereco novoEndereco = cepService.buscaEnderecoPorCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        construtora.setEnderecos(endereco);
        construtoraRepository.save(construtora);
    }

}
