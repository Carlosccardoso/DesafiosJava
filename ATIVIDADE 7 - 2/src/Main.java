public class Main {
    class URL {
        String endereco;
        URL proximo;

        public URL(String endereco) {
            this.endereco = endereco;
            this.proximo = null;
        }
    }

    class HistoricoNavegacao {
        URL inicio;
        int tamanhoMaximo;
        int tamanhoAtual;

        public HistoricoNavegacao(int tamanhoMaximo) {
            this.inicio = null;
            this.tamanhoMaximo = tamanhoMaximo;
            this.tamanhoAtual = 0;
        }

        public void adicionarURL(String endereco) {
            URL novaURL = new URL(endereco);
            if (inicio == null) {
                inicio = novaURL;
            } else {
                URL atual = inicio;
                while (atual.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = novaURL;
            }
            tamanhoAtual++;

            if (tamanhoAtual > tamanhoMaximo) {
                removerAntiga();
            }
        }

        public void removerAntiga() {
            if (inicio != null) {
                inicio = inicio.proximo;
                tamanhoAtual--;
            }
        }

        public void listarHistorico() {
            URL atual = inicio;
            while (atual != null) {
                System.out.println(atual.endereco);
                atual = atual.proximo;
            }
        }
    }

}