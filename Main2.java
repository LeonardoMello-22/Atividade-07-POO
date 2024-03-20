public class Main2 {
    public static void main(String[] args) {
        Medico medicoLeo = new Medico("082", "leonardo", 'M', "Cardiologista", "rua amelia cunha 242");
        Endereço enderecoLeo = new Endereço("rua Amelia cunha", "142", "apto 804", "Boa Viagem", "Recife", "PE", "81924-42");
        
        System.out.println("Dados do médico: ");
        System.out.println(medicoLeo);
        
        medicoLeo.modificarMedico("Jobson", "19/03/2025", 'F', "Hapvida", "avenida da Saudade 555");
        System.out.println("\nNovos dados do médico: ");
        System.out.println(medicoLeo);
        
        System.out.println("\nDados do endereço informados pelo paciente: ");
        System.out.println(enderecoLeo);
        
        enderecoLeo.modificarEndereco("arnaldo antunes", "06", "Apto1408", "ipsep");
        System.out.println("\nNovos dados do endereço: ");
        System.out.println(enderecoLeo);
    }
}
