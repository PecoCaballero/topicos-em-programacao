package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locadora {
    private List<Aluguel> alugueis;

    public Locadora(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    void cadastraAluguel(Cliente cliente, List<DVD> dvds, Date dataLocacao, int idAluguel){
        alugueis.add(new Aluguel(dvds, cliente, idAluguel, dataLocacao));
    }

    public Aluguel procuraAlugueis(int idAluguel){
        for (Aluguel aluguel : alugueis){
            if(aluguel.getId_aluguel() == idAluguel){
                return aluguel;
            }
        }
        return null;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    @Override
    public String toString() {
        return "Locadora{" +
                "alugueis=" + alugueis +
                '}';
    }
}
