package desafio.dio.service;

import desafio.dio.integracao.viacep.repository.EnderecoRepository;
import desafio.dio.integracao.viacep.service.ViaCepService;
import desafio.dio.model.Construtora;
import desafio.dio.repository.ConstrutoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConstrutoraServiceImpl implements ConstrutoraService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ConstrutoraRepository construtoraRepository;

//    @Autowired
//    private EnderecoRepository enderecoRepository;
//
//    @Autowired
//    private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Construtora> buscarTodos() {
        // Buscar todos os Clientes.
        return construtoraRepository.findAll();
    }

    @Override
    public Construtora buscarPorId(Long id) {
        // Buscar Cliente por ID.
        Optional<Construtora> construtora = construtoraRepository.findById(id);
        return construtora.get();
    }

    @Override
    public void inserir(Construtora construtora) {
        salvarConstrutora(construtora);
    }

    private void salvarConstrutora(Construtora construtora) {
    }

    @Override
    public void atualizar(Long id, Construtora construtora) {
        // Buscar Cliente por ID, caso exista:
        Optional<Construtora>  construtorabD = construtoraRepository.findById(id);
        if (construtorabD.isPresent()) {
            atualizarConstrutora(construtora);
        }
    }

    private void atualizarConstrutora(Construtora construtora) {
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        construtoraRepository.deleteById(id);
    }

//    private void salvarClienteComCep(Cliente cliente) {
//        // Verificar se o Endereco do Cliente já existe (pelo CEP).
//        String cep = cliente.getEndereco().getCep();
//        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
//            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
//            Endereco novoEndereco = viaCepService.consultarCep(cep);
//            enderecoRepository.save(novoEndereco);
//            return novoEndereco;
//        });
//        cliente.setEndereco(endereco);
//        // Inserir Cliente, vinculando o Endereco (novo ou existente).
//        clienteRepository.save(cliente);
//    }




}
