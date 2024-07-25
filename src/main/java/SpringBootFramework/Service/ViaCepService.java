package SpringBootFramework.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import SpringBootFramework.Model.Endereco;

/**
 * Client HTTP, criado via <b>OpenFeign</b> para consumo da API do
 * <b>ViaCEP</b>;
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud
 *      OpenFeign</a>
 *      see <a href="https://viacep.com.br/">ViaCEP</a>
 *      Author falvojr - Prof Venilton
 */

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    static Endereco consultarCep(@PathVariable("cep") String cep) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarCep'");
    }

}
