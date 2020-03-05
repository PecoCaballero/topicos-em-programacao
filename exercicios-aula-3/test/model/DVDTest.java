package model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DVDTest {

    static DVD dvd;

    @BeforeAll
    static void createObject(){
        dvd = new DVD(
                1,
                "Harry Potter",
                "Mágica"
        );
    }

    @Test
    void getId_dvd() {
        assertEquals(1, dvd.getId_dvd());
    }

    @Test
    void getNome() {
        assertEquals("Harry Potter", dvd.getNome());
    }

    @Test
    void getDescricao() {
        assertEquals("Mágica", dvd.getDescricao());
    }

}