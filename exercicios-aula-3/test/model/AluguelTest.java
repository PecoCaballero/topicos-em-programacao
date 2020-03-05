package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AluguelTest {

    static Aluguel aluguel;
    static List<DVD> dvds = new ArrayList<DVD>();
    static Date data;

    @BeforeAll
    static void createObject(){
        dvds.add(new DVD(1, "Harry Potter", "Mágica"));
        dvds.add(new DVD(2, "Duro de Matar", "Acao"));
        Cliente cliente = new Cliente(1, "Thiago Nascimento", "444.555.666-77");
        data = new Date(2020, Calendar.MARCH, 02);
        aluguel = new Aluguel(
                dvds,
                cliente,
                1,
                data
        );
    }

    @Test
    void cadastraAluguel(){
        Aluguel aluguel = new Aluguel(
                dvds,
                new Cliente(
                        1,
                        "Pedro Afonso",
                        "111.222.333-44"),
                1,
                data);
        this.aluguel.cadastraAluguel(aluguel);
        assertEquals(aluguel.getCliente(), this.aluguel.getCliente());
    }

    @Test
    void cadastraListaDVD(){
        List<DVD> dvds = new ArrayList<>();
        dvds.add(new DVD(3, "Vingadores", "Heróis"));
        dvds.add(new DVD(4, "Harry Potter 2", "Mágica 2"));
        this.aluguel.cadastraListaDVD(dvds);
        assertEquals(dvds, this.aluguel.getDvds());
    }

    @Test
    void getDvds() {
        assertEquals(dvds, aluguel.getDvds());
    }

    @Test
    void getCliente() {
        assertEquals(1, aluguel.getCliente().getId_cliente());
    }

    @Test
    void getId_aluguel() {
        assertEquals(1, aluguel.getId_aluguel());
    }

    @Test
    void getData_aluguel() {
        assertEquals(data, aluguel.getData_aluguel());
    }
}