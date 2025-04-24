import java.util.*;

public class ListaDeTarefas {
    private List<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                System.out.println("⚠ Tarefa já existe na lista!");
                return;
            }
        }
        tarefas.add(new Tarefa(descricao));
        System.out.println("✅ Tarefa adicionada com sucesso!");
    }

    public void removerTarefa(String descricao) {
        Iterator<Tarefa> iterator = tarefas.iterator();
        while (iterator.hasNext()) {
            Tarefa t = iterator.next();
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                System.out.println("Tem certeza que deseja remover? (s/n)");
                Scanner scanner = new Scanner(System.in);
                String confirmacao = scanner.next();
                if (confirmacao.equalsIgnoreCase("s")) {
                    iterator.remove();
                    System.out.println("✅ Tarefa removida!");
                } else {
                    System.out.println("❌ Remoção cancelada.");
                }
                return;
            }
        }
        System.out.println("⚠ Tarefa não encontrada.");
    }

    public void listarTarefas(boolean alfabetica) {
        if (tarefas.isEmpty()) {
            System.out.println("📭 Nenhuma tarefa cadastrada.");
            return;
        }

        List<Tarefa> listaOrdenada = new ArrayList<>(tarefas);
        if (alfabetica) {
            Collections.sort(listaOrdenada);
        } else {
            listaOrdenada.sort(Comparator.comparing(Tarefa::getDataCriacao));
        }

        System.out.println("\n📌 Lista de Tarefas:");
        for (Tarefa t : listaOrdenada) {
            System.out.println(" - " + t);
        }
    }
}
