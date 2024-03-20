public class Endereço {
    String rua;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String uf;
    String cep;

    public Endereço(String rua, String numero, String complemento, String bairro, String cidade, String uf, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public void modificarEndereco(String novaRua, String novoNumero, String novoComplemento, String novoBairro) {
        this.rua = novaRua;
        this.numero = novoNumero;
        this.complemento = novoComplemento;
        this.bairro = novoBairro;
    }

    public String toString() {
        return "Rua: " + rua + "\n" +
               "Número: " + numero + "\n" +
               "Complemento: " + complemento + "\n" +
               "Bairro: " + bairro + "\n" +
               "Cidade: " + cidade + "\n" +
               "UF: " + uf + "\n" +
               "CEP: " + cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}