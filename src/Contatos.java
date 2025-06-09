import java.util.ArrayList;
import java.util.Scanner;

public class Contatos {
    public static void main(String[] args) {
        int numeroEscolhido = 0;
        ArrayList<String> nomes = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                
                Olá o que deseja fazer? 
                1) Adicionar Nome
                2) Remover Nome
                3) Mostrar Nomes
                4) Sair""");

        while (numeroEscolhido < 4) {
            numeroEscolhido = leitura.nextInt();
            leitura.nextLine();

            if (numeroEscolhido == 4) {
                System.out.println("Aplicação encerrada!");
            }

            if (numeroEscolhido == 1) {
                System.out.println("Digite o nome da pessoa para ser adicionada: ");
                String nome = leitura.nextLine();
                nomes.add(nome);
                System.out.println("Contato adicionado!");
            }

            if (numeroEscolhido == 2) {
                System.out.println("Digite o nome do contato que deseja remover: ");
                String removerNome = leitura.nextLine();
                if (nomes.remove(removerNome)) {
                    System.out.println("Contato removido!");
                } else {
                    System.out.println("Esse contato não existe");
                }
            }

            if (numeroEscolhido == 3) {
                System.out.println("Lista de Contatos: ");
                if (nomes.isEmpty()) {
                    System.out.println("Nenhum contato cadastrado");
                } else {
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println((i + 1) + ") " + nomes.get(i));
                    }
                }
            }
        }
    }
}
