package Models;

import java.time.Instant;

public class Sessao {
    private long id;
    private Filme filmeAssociado;
    private Instant horario;

    public Sessao(long id, Filme filmeAssociado) {
        this.id = id;
        this.filmeAssociado = filmeAssociado;
    }

    public Sessao(long id, Filme filmeAssociado, Instant horario) {
        this(id, filmeAssociado);
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id=" + id +
                ", filmeAssociado=" + filmeAssociado +
                ", horario=" + horario +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Filme getFilmeAssociado() {
        return filmeAssociado;
    }

    public void setFilmeAssociado(Filme filmeAssociado) {
        this.filmeAssociado = filmeAssociado;
    }

    public Instant getHorario() {
        return horario;
    }

    public void setHorario(Instant horario) {
        this.horario = horario;
    }
}
