public class Main {
    class Carta {
        String nome;
        Carta proximo;
        Carta anterior;

        public Carta(String nome) {
            this.nome = nome;
            this.proximo = null;
            this.anterior = null;
        }
    }

    class MaoJogador {
        Carta inicio;

        public void adicionarCarta(String nome) {
            Carta novaCarta = new Carta(nome);
            if (inicio == null) {
                inicio = novaCarta;
            } else {
                Carta atual = inicio;
                while (atual.proximo != null) {
                    atual = atual.proximo;
                }
                atual.proximo = novaCarta;
                novaCarta.anterior = atual;
            }
        }

        public void removerCarta(String nome) {
            Carta atual = inicio;
            while (atual != null && !atual.nome.equals(nome)) {
                atual = atual.proximo;
            }

            if (atual != null) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                }
            }
        }

        public void listarCartas() {
            Carta atual = inicio;
            while (atual != null) {
                System.out.println(atual.nome);
                atual = atual.proximo;
            }
        }
    }

}