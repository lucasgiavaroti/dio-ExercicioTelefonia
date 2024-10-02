package exercicios;

import java.util.Scanner;

public class VerificaCombo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite os serviços que o cliente  contratou, separados por 'Vírgula': ");
        String servicos = scan.nextLine().trim();

        // Transformando nossa String em um array, separando por vírgula
        String [] servicosArray = servicos.split(",");

        // Chamando o metodo e atribuindo a uma String
        String resultado = verificarComboCompleto(servicosArray);

        System.out.printf("O cliente contratou os seguintes serviços %s.\n%s",servicos,resultado);

        scan.close();

    }

    // TODO: Verifique se o cliente possui todos os serviços contratados
    public static String verificarComboCompleto(String [] servicosArray){
            boolean movelContratado = false;
            boolean bandaLargalContratado = false;
            boolean tvlContratado = false;
        for (String servico : servicosArray){
            if(servico.trim().equalsIgnoreCase("movel")){
                movelContratado = true;
            }
            if(servico.trim().equalsIgnoreCase("banda larga")){
                bandaLargalContratado = true;
            }
            if(servico.trim().equalsIgnoreCase("tv")){
                tvlContratado = true;
            }
        }
        boolean comboCompleto = movelContratado && bandaLargalContratado && tvlContratado;
        return (comboCompleto) ? "Combo Completo" : "Combo Incompleto";
    }
}
