import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa implements Comparable<Tarefa> {
    private String descricao;
    private LocalDateTime dataCriacao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.dataCriacao = LocalDateTime.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return descricao + " (Criada em: " + dataCriacao.format(formatter) + ")";
    }

    @Override
    public int compareTo(Tarefa outra) {
        return this.descricao.compareToIgnoreCase(outra.descricao);
    }
}
