public class Clinica {
    String codigo;
    String nome;
    String dataNascimento;
    String sexo;
    String planoSaude;
    String alergia;
    String tipoSanguineo;

    public Clinica(String codigo , String nome, String dataNascimento, String sexo, String planoSaude, String alergia,String tipoSanguineo){
    this.codigo = codigo;
    this.nome = nome;
    this.dataNascimento =  dataNascimento;
    this.sexo = sexo;
    this.planoSaude = planoSaude;
    this.alergia = alergia;
    this.tipoSanguineo = tipoSanguineo;
    }
    public void modificarDados(String novoNome, String novaDataNascimento, String novoSexo, String novoPlanoSaude) {
        this.nome = novoNome;
        this.dataNascimento = novaDataNascimento;
        this.sexo = novoSexo;
        this.planoSaude = novoPlanoSaude;
} 
public String toString() {
    return "Código: " + codigo + "\n" +
           "Nome: " + nome + "\n" +
           "Data de Nascimento: " + dataNascimento + "\n" +
           "Sexo: " + sexo + "\n" +
           "Plano de Saúde: " + planoSaude + "\n" +
           "Alergia: " + alergia + "\n" +
           "Tipo Sanguíneo: " + tipoSanguineo;
}
}