package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    static Cliente cliente;

    @BeforeAll
    static void createObject(){
        cliente = new Cliente(1,
                "Thiago Nascimento",
                "444.555.666-77");
    }

    @Test
    void getId_cliente() {
        assertEquals(1, cliente.getId_cliente());
    }

    @Test
    void getNome() {
        assertEquals("Thiago Nascimento", cliente.getNome());
    }

    @Test
    void getCpf() {
        assertEquals("444.555.666-77", cliente.getCpf());
    }

}