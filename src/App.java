import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("PROCESSO SELETIVO \n");
        selecaoCandidatos();
        
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Edson", "Antonio", "Gemerson", "Lucas", "Gutemberg", "Waldeir", "Carioca", "Manuel", "Wolf", "André"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salario = 2000.0;

        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato: " + candidato + " solicitou o valor: "+ salarioPretendido);

            if (salario >= salarioPretendido){
                System.out.println("O candidato: "+ candidato + " foi selecionado!");
                candidatosSelecionados++;
            }
            
                
                candidatosAtual++;
            
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salario;

        salario = 1000;

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
