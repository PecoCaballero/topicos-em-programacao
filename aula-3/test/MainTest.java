import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static Main m;

    @BeforeAll
    static void createObject(){
         m = new Main();
    }


    @Test
    @DisplayName("Teste com o assertEquals do metodo adicao...")
    void testCase01Sum(){
        assertEquals(3, m.sum(1, 2));
    }

    @Test
    @DisplayName("Teste com o assertEquals do metodo adicao...")
    void testCase02Sum(){
        assertNotEquals(5, m.sum(2, 7));
    }

    @Test
    @DisplayName("Teste com o assertEquals do metodo subtracao...")
    void testCase01Subtraction(){
        assertEquals(2, m.subtraction(5, 3));
    }

    @Test
    @DisplayName("Teste com o assertEquals do metodo subtracao...")
    void testCase02Subtraction(){
        assertNotEquals(1, m.subtraction(7, 3));
    }

    @Test
    @DisplayName("Teste com o assertEquals do metodo divisao...")
    void testCase01Division(){
        assertEquals(2, m.division(6, 3));
    }

    @Test
    @DisplayName("Teste com o assertEquals do metodo divisao...")
    void testCase02Division(){
        assertNotEquals(3, m.division(4, 2));
    }

    @Test
    @DisplayName("Teste com o assertEquals do metodo multiplicacao...")
    void testCase01Multiplication(){
        assertEquals(18, m.multiplication(6, 3));
    }

    @Test
    @DisplayName("Teste com o assertEquals do metodo multiplicacao...")
    void testCase02Multiplication(){
        assertNotEquals(10, m.multiplication(4, 2));
    }

}