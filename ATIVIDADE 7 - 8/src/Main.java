    import java.util.LinkedList;
    import java.util.Queue;


public class Main {

    class GerenciadorProcessos {
        Queue<String> filaProcessos = new LinkedList<>();

        public void adicionarProcesso(String processo) {
            filaProcessos.add(processo);
            System.out.println("Processo " + processo + " adicionado à fila.");
        }

        public void executarProcesso() {
            if (!filaProcessos.isEmpty()) {
                System.out.println("Executando processo: " + filaProcessos.poll());
            } else {
                System.out.println("Nenhum processo na fila.");
            }
        }

        public void listarProcessos() {
            System.out.println("Fila de processos: " + filaProcessos);
        }
    }

}