import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        String [] candidados = {"Edson", "Antonio", "Gemerson", "Lucas", "Gutemberg"};
        for(String candidao: candidados){
            entrandoEmContato(candidao);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do {
            atendeu=atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }
            else
            System.out.println("Contato realizado com sucesso!");

        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        }

        else
            System.out.println("Não conseguimos contato com " + candidato + ", numero máximo de tentativas: "+ tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidados = {"Edson", "Antonio", "Gemerson", "Lucas", "Gutemberg"};
        System.out.println("Imprimindo a lista de candidatos");

        for (int indice=0; indice < candidados.length; indice++){
            System.out.println("O candidato de n° "+ (indice+1) + " é " + candidados[indice]);
        }
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
