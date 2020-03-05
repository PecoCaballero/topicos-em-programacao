package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LocadoraTest {

    static Locadora locadora;
    static List<Aluguel> alugueis = new ArrayList<Aluguel>();

    @BeforeAll
    static void createObject(){
        List<DVD> dvds1 = new ArrayList<DVD>();
        dvds1.add(new DVD(1, "Harry Potter", "Mágica"));
        dvds1.add(new DVD(2, "Harry Potter 2", "Mágica 2"));
        Cliente cliente1 = new Cliente(1, "Thiago Nascimento", "444.555.666-77");
        Aluguel aluguel1 = new Aluguel(dvds1, cliente1, 1, new Date(2020, Calendar.FEBRUARY, 28));
        List<DVD> dvds2 = new ArrayList<DVD>();
        dvds2.add(new DVD(3, "Vingadores", "Heróis"));
        Cliente cliente2 = new Cliente(2, "Pedro Afonso", "111.222.333-44");
        Aluguel aluguel2 = new Aluguel(dvds2, cliente2, 2, new Date(2020, Calendar.MARCH, 3));
        alugueis.add(aluguel1);
        alugueis.add(aluguel2);
        locadora = new Locadora(alugueis);
    }

    @Test
    void cadastraAluguel() {
        Cliente cliente = new Cliente(3, "Yuri Leonel", "987.654.321-00");
        List<DVD> dvds = new ArrayList<DVD>();
        dvds.add(new DVD(4, "Duro de Matar", "Acao"));
        locadora.cadastraAluguel(cliente, dvds, new Date(2020, Calendar.MARCH, 4), 3);
        assertEquals(3, locadora.procuraAlugueis(3).getCliente().getId_cliente());
    }

    @Test
    void procuraAlugueis() {
        assertEquals(2, locadora.procuraAlugueis(2).getId_aluguel());
    }

    @Test
    void getAlugueis() {
        assertEquals(alugueis, locadora.getAlugueis());
    }
}