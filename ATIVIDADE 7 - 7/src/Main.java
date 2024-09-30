    import java.util.LinkedList;
    import java.util.Queue;

    public class Main {

    class GerenciadorImpressao {
        Queue<String> filaImpressao = new LinkedList<>();

        public void adicionarTrabalho(String trabalho) {
            filaImpressao.add(trabalho);
            System.out.println("Trabalho " + trabalho + " adicionado à fila de impressão.");
        }

        public void processarTrabalho() {
            if (!filaImpressao.isEmpty()) {
                System.out.println("Imprimindo: " + filaImpressao.poll());
            } else {
                System.out.println("Nenhum trabalho na fila.");
            }
        }

        public void listarFila() {
            System.out.println("Fila de impressão: " + filaImpressao);
        }
    }

}