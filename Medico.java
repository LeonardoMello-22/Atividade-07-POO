public class Medico {
    String codigo;
    String nome;
    char sexo;
    String especialidade;
    String endereco;
    
    public Medico(String codigo, String nome, char sexo, String especialidade, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
    public void modificarMedico(String novoCodigo, String novoNome, char novoSexo, String novaEspecialidade, String novoEndereco){
        this.codigo = novoCodigo;
        this.nome = novoNome;
        this.sexo = novoSexo;
        this.especialidade = novaEspecialidade;
        this.endereco = novoEndereco;  
    }
    public String toString() {
        return "Código: " + codigo + "\n" +
               "Nome: " + nome + "\n" +
               "Sexo: " + sexo + "\n" +
               "Especialidade: " + especialidade + "\n" +
               "Endereço: " + endereco + "\n";
    }
}
