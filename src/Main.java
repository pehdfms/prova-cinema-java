import Models.Categoria;
import Models.Filme;
import Models.Sessao;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Categoria acao = new Categoria("Acao", 0);
        Categoria aventura = new Categoria("Aventura", 1);
        Categoria comedia = new Categoria("Comedia", 2);

        Filme novoFilme = new Filme("Esquadrao Suicida", 0);

        System.out.println("Filme sem categorias: ");
        System.out.println(novoFilme);

        novoFilme.addCategoria(acao);
        novoFilme.addCategoria(aventura);
        novoFilme.addCategoria(comedia);

        System.out.println();
        System.out.println("Filme com categorias: ");
        System.out.println(novoFilme);

        Sessao novaSessao = new Sessao(novoFilme, Instant.now(), 0);

        System.out.println();
        System.out.println("Sessao apresentando este filme: ");
        System.out.println(novaSessao);
    }
}
