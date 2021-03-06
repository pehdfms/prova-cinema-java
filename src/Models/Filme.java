package Models;

import java.util.ArrayList;

public class Filme {
    private String nome;
    private long id;
    private ArrayList<Categoria> categorias = new ArrayList<>();

    public Filme(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public Filme(String nome, long id, ArrayList<Categoria> categorias) {
        this(nome, id);
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", categorias=" + categorias +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void addCategoria(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        this.categorias.remove(categoria);
    }
}
