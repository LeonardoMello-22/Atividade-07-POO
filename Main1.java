public class Main1 {
    public static void main(String[] args){
        Clinica pacienteLeo = new Clinica("154", "Leonardo", "22/12/2004", "Masculino", "amil", "Não tem", "0+");
        System.out.println("\nDados informados pelo paciente: " + pacienteLeo);
        pacienteLeo.modificarDados("Jobson", "19/03/2025", "Feminino", "Hapvida");
        System.out.println("\nNovos dados:" + pacienteLeo);
    }
}
