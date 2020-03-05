package model;

public class DVD {
    private int id_dvd;
    private String nome, descricao;

    public DVD(int id_dvd, String nome, String descricao) {
        this.id_dvd = id_dvd;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId_dvd() {
        return id_dvd;
    }

    public void setId_dvd(int id_dvd) {
        this.id_dvd = id_dvd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "id_dvd=" + id_dvd +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
