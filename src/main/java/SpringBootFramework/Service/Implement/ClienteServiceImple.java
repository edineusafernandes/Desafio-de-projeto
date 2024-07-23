package SpringBootFramework.Service.Implement;

import org.springframework.stereotype.Service;

import SpringBootFramework.Model.Cliente;
import SpringBootFramework.Service.ClienteService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring via {@link Autowired}. Com isso, essa classe é um
 * {@link Service}, ela será tratada como um<b>Singleton</b>.
 */

@Service
public class ClienteServiceImple implements ClienteService {

    // TODO Singleton: Injetar os compomentes do Spring com Autowired.
    // TODO Strategy: Implementar os métodos definidos na interface.
    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface
    // simles.

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // FIXEME Buscar Cliente por ID, caso exista.
        // FIXEME Verificar se o Endereço do ciente já exite (pelo CEP).
        // FIXEME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        // FIXEME Alterar cliente, vinculando o endereço (novo ou existente).

    }

    @Override
    public Cliente buscarPorId(Long Id) {
        // FIXEME Buscar Cliente por ID.
        return null;
    }

    @Override
    public Iterable<Cliente> buscarTodos() {
        // FIXEME Buscar todos os Clientes.
        return null;
    }

    @Override
    public void deletar(Long id) {
        // FIXEME Deletar cliente por ID.

    }

    @Override
    public void inserir(Cliente cliente) {
        // FIXEME Verificar se o Endereço do cliente já existe pelo CEP
        // FIXEME Caso não exista, integrar com o ViaCEP e persistir o retorno.
        // FIXEME Inserir cliente, vinculando o endereço (novo ou existente). }

    }
}