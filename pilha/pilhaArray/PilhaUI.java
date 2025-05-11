import java.util.Scanner;

public class PilhaUI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a capacidade inicial da sua Pilha?");
        int capacidade = sc.nextInt();
        sc.nextLine(); // consome o ENTER pendente

        Pilha pilha = new Pilha(capacidade);

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - push | 2 - pop | 3 - peek | 4 - isEmpty | 5 - size | 6 - mostrar pilha | 0 - encerrar");

            int operacao = -1;

            // valida entrada da operação
            try {
                operacao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
                continue;
            }

            switch (operacao) {
                case 1:
                    System.out.println("O que deseja empilhar?");
                    String elemento = sc.nextLine();
                    pilha.push(elemento);
                    System.out.println("Elemento empilhado: " + elemento);
                    break;

                case 2:
                    try {
                        Object removido = pilha.pop();
                        System.out.println("Elemento (" + removido + ") desempilhado!");
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("O índice do topo é: " + pilha.peek());
                    } catch (RuntimeException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 4:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("A pilha não está vazia!");
                    }
                    break;

                case 5:
                    System.out.println("O tamanho da pilha é: " + pilha.size());
                    break;

                case 6:
                    pilha.print();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
