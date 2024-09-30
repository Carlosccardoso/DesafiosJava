    import java.util.LinkedList;
    import java.util.Queue;

public class Main {

    class Banco {
        Queue<String> filaClientes = new LinkedList<>();

        public void adicionarCliente(String nome) {
            filaClientes.add(nome);
            System.out.println("Cliente " + nome + " adicionado à fila.");
        }

        public void atenderCliente() {
            if (!filaClientes.isEmpty()) {
                System.out.println("Atendendo cliente: " + filaClientes.poll());
            } else {
                System.out.println("Nenhum cliente na fila.");
            }
        }

        public void listarFila() {
            System.out.println("Clientes na fila: " + filaClientes);
        }
    }

}