public class Main {
    class AcaoDupla {
        String descricao;
        AcaoDupla proximo;
        AcaoDupla anterior;

        public AcaoDupla(String descricao) {
            this.descricao = descricao;
            this.proximo = null;
            this.anterior = null;
        }
    }

    class EditorTexto {
        AcaoDupla atual;

        public void realizarAcao(String descricao) {
            AcaoDupla novaAcao = new AcaoDupla(descricao);
            if (atual != null) {
                atual.proximo = novaAcao;
                novaAcao.anterior = atual;
            }
            atual = novaAcao;
        }

        public void desfazer() {
            if (atual != null) {
                System.out.println("Desfazendo: " + atual.descricao);
                atual = atual.anterior;
            } else {
                System.out.println("Nada a desfazer");
            }
        }

        public void refazer() {
            if (atual != null && atual.proximo != null) {
                atual = atual.proximo;
                System.out.println("Refazendo: " + atual.descricao);
            } else {
                System.out.println("Nada a refazer");
            }
        }

        public void listarAcoes() {
            AcaoDupla temp = atual;
            while (temp != null) {
                System.out.println(temp.descricao);
                temp = temp.anterior;
            }
        }
    }

}