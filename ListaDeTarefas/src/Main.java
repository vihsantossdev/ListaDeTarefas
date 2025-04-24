import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        while (true) {
            System.out.println("\n📋 MENU:");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Listar Tarefas (Alfabética)");
            System.out.println("4 - Listar Tarefas (Cronológica)");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    listaDeTarefas.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.print("Digite a descrição da tarefa a remover: ");
                    String tarefaRemover = scanner.nextLine();
                    listaDeTarefas.removerTarefa(tarefaRemover);
                    break;
                case 3:
                    listaDeTarefas.listarTarefas(true);
                    break;
                case 4:
                    listaDeTarefas.listarTarefas(false);
                    break;
                case 5:
                    System.out.println("📌 Aplicação encerrada.");
                    return;
                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }
    }
}

