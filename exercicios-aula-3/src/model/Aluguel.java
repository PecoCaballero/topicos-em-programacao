package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluguel {
    private List<DVD> dvds = new ArrayList<DVD>();
    private Cliente cliente;
    private int id_aluguel;
    private Date data_aluguel;

    public Aluguel(List<DVD> dvds, Cliente cliente, int id_aluguel, Date data_aluguel) {
        this.dvds = dvds;
        this.cliente = cliente;
        this.id_aluguel = id_aluguel;
        this.data_aluguel = data_aluguel;
    }

    public void cadastraListaDVD(List<DVD> dvds){
        this.dvds = dvds;
    }

    public void cadastraAluguel(Aluguel aluguel){
        this.dvds = aluguel.dvds;
        this.cliente = aluguel.cliente;
        this.id_aluguel = aluguel.id_aluguel;
        this.data_aluguel = aluguel.data_aluguel;
    }

    public List<DVD> getDvds() {
        return dvds;
    }

    public void setDvds(List<DVD> dvds) {
        this.dvds = dvds;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId_aluguel() {
        return id_aluguel;
    }

    public void setId_aluguel(int id_aluguel) {
        this.id_aluguel = id_aluguel;
    }

    public Date getData_aluguel() {
        return data_aluguel;
    }

    public void setData_aluguel(Date data_aluguel) {
        this.data_aluguel = data_aluguel;
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "dvds=" + dvds +
                ", cliente=" + cliente +
                ", id_aluguel=" + id_aluguel +
                ", data_aluguel=" + data_aluguel +
                '}';
    }
}
