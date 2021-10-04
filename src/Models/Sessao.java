package Models;

import java.time.Instant;

public class Sessao {
    private Filme filmeAssociado;
    private Instant horario;
    private long id;

    public Sessao(Filme filmeAssociado, Instant horario, long id) {
        this.filmeAssociado = filmeAssociado;
        this.horario = horario;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "filmeAssociado=" + filmeAssociado +
                ", horario=" + horario +
                ", id=" + id +
                '}';
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
