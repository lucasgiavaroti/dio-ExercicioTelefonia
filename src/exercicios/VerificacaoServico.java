package exercicios;

import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        System.out.print("Digite o serviço a ser verificado: ");
        String servico = scan.nextLine();

        // Entrada do nome do cliente e os serviços contratados
        System.out.print("\nDigite o nome do cliente, e os serviços que ele contratou separados por 'Vírgula': ");
        String entradaCliente = scan.nextLine();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");

        String nomeCliente = partes[0].trim();

        String[] servicosContratados = new String[partes.length-1];
        // Copiando do array partes para o array servicosContratados
        System.arraycopy(partes, 1, servicosContratados, 0, partes.length-1);

        // Chamando metodo que verifica se o cliente contratou o serviço
       String resultado = verificaServico(servico,servicosContratados);

        System.out.printf("\nO cliente %s contratou o serviço %s?\nResposta: %s",nomeCliente,servico,resultado);

        scan.close();
    }

    // TODO: Verifique se o serviço está na lista de serviços contratados
    public static String verificaServico(String servico, String [] servicosContratados){
        boolean contratado = false;
        for (String parte : servicosContratados) {
            if (servico.equalsIgnoreCase(parte.trim())) {
                contratado = true;
                break;
            }
        }
        return (contratado) ? "Sim" : "Nao";
    }
}
