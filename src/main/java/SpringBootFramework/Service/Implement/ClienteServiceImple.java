package SpringBootFramework.Service.Implement;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootFramework.Model.Cliente;
import SpringBootFramework.Model.ClienteRepository;
import SpringBootFramework.Model.Endereco;
import SpringBootFramework.Model.EnderecoRepository;
import SpringBootFramework.Service.ClienteService;
import SpringBootFramework.Service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring via {@link Autowired}. Com isso, essa classe é um
 * {@link Service}, ela será tratada como um<b>Singleton</b>.
 */

@Service
public class ClienteServiceImple implements ClienteService {

    // TODO Singleton: Injetar os compomentes do Spring com Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;
    // TODO Strategy: Implementar os métodos definidos na interface.
    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface
    // simles.

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // FIXEME Buscar Cliente por ID, caso exista.
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            SalvarClienteComCep(cliente);
        }
        // FIXEME Verificar se o Endereço do ciente já exite (pelo CEP).
        // FIXEME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        // FIXEME Alterar cliente, vinculando o endereço (novo ou existente).

    }

    @Override
    public Cliente buscarPorId(Long id) {
        // FIXEME Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        // FIXEME Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        // FIXEME Deletar cliente por ID.
        clienteRepository.delete(null);

    }

    @Override
    public void inserir(Cliente cliente) {
        getEndereco(cliente);
    }

    private void getEndereco(Cliente cliente) {
        SalvarClienteComCep(cliente);
    }

    private void SalvarClienteComCep(Cliente cliente) {
        // Verificar se o Endereço do cliente já existe pelo CEP
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // FIXEME Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = ViaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        // Inserir cliente, vinculando o endereço (novo ou existente). }
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}