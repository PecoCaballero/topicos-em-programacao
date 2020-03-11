package model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class VeiculoTest {

    static Veiculo v;
    static Veiculo clone;

    @BeforeAll
    static void createObject(){
        v = new Veiculo();
    }

    @Order(1)
    @Test
    @Tag("tag-01")
    @Tag("tag-02")
    @Tag("tag-03")
    void inicializa() {
        v.inicializa("terrestre", "123456", 4, 1800);
    }

    @Order(2)
    @Test
    @Tag("tag-02")
    @ParameterizedTest
    @ValueSource(strings = {"terrestre", "aquático", "áereo"})
    void retornaTipo(String str) {

        /* este metodo deve retornar sucesso, falha, falha
         uma vez que esta recebendo 3 tipos e somente terrestre
         funcionar */

        String tipo = v.retornaTipo();
        assertEquals(str, tipo);
    }

    @Order(3)
    @Test
    @Tag("tag-02")
    void retornaNumeroChassi() {
        assertEquals("123456", v.retornaNumeroChassi());
    }

    @Order(4)
    @Test
    @Tag("tag-02")
    void retornaNumeroRodas() {
        assertEquals(4, v.retornaNumeroRodas());
    }

    @Order(5)
    @Test
    @Tag("tag-02")
    void retornaPotenciaMotor() {
        assertEquals(1800.0, v.retornaPotenciaMotor());
    }

    @Order(6)
    @Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    @Tag("tag-03")
    void clona() {
        clone = v.clona(v);
        assertEquals(v.retornaNumeroChassi(), clone.retornaNumeroChassi());
    }

    @Order(7)
    @Test
    @EnabledOnJre({JRE.JAVA_13})
    @Tag("tag-03")
    void compara() {
        assertEquals(1, v.compara(v, clone));
    }
}