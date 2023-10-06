public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("PROCESSO SELETIVO \n");

        analisarCandidato(1900.0);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);
    }

    static void analisarCandidato(double salarioPretendido){
        double salario;

        salario = 2000;

        if (salario > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO \n");
        }

        else if(salario == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA \n");
        }

        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS \n");
        }
    }
}
