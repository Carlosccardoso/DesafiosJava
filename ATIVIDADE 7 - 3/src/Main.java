public class Main {
    class Acao {
        String descricao;
        Acao proximo;

        public Acao(String descricao) {
            this.descricao = descricao;
            this.proximo = null;
        }
    }

    class ControleReversao {
        Acao topo;

        public ControleReversao() {
            topo = null;
        }

        public void realizarAcao(String descricao) {
            Acao novaAcao = new Acao(descricao);
            novaAcao.proximo = topo;
            topo = novaAcao;
        }

        public void desfazer() {
            if (topo != null) {
                System.out.println("Desfazendo: " + topo.descricao);
                topo = topo.proximo;
            } else {
                System.out.println("Nada a desfazer");
            }
        }

        public void listarAcoes() {
            Acao atual = topo;
            while (atual != null) {
                System.out.println(atual.descricao);
                atual = atual.proximo;
            }
        }
    }

}