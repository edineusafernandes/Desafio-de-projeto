package SpringBootFramework.Model;

import java.util.LinkedHashMap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/*Os stributos desse modelo foram gerados automaticamente pelo site
jsonschema2pojo.org
Para isso, usamos o JSON de retorno da API do viaCEP
@see <a href= "https://viacep.com.br">ViaCEP</a>
@see <a href= "https://www.jsonschema2pojo.org/">jsonschema2pojo.org</a>
 */

@Entity
public class Endereco {
    @Id
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("complemento")
    private String complemento;
    @JsonProperty("unidade")
    private String unidade;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("uf")
    private String uf;
    @JsonProperty("ibge")
    private String ibge;
    @JsonProperty("ddd")
    private String ddd;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

}
