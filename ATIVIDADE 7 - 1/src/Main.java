class Tarefa {
    String descricao;
    boolean concluida;
    Tarefa proximo;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
        this.proximo = null;
    }
}

class GerenciadorTarefas {
    Tarefa inicio;

    public GerenciadorTarefas() {
        this.inicio = null;
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        if (inicio == null) {
            inicio = novaTarefa;
        } else {
            Tarefa atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novaTarefa;
        }
    }

    public void removerTarefa(String descricao) {
        if (inicio == null) return;

        if (inicio.descricao.equals(descricao)) {
            inicio = inicio.proximo;
            return;
        }

        Tarefa atual = inicio;
        while (atual.proximo != null && !atual.proximo.descricao.equals(descricao)) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }

    public void marcarConcluida(String descricao) {
        Tarefa atual = inicio;
        while (atual != null) {
            if (atual.descricao.equals(descricao)) {
                atual.concluida = true;
                return;
            }
            atual = atual.proximo;
        }
    }

    public void listarTarefas() {
        Tarefa atual = inicio;
        while (atual != null) {
            System.out.println(atual.descricao + " - " + (atual.concluida ? "Concluída" : "Pendente"));
            atual = atual.proximo;
        }
    }
}
