import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MainTest {

    @Test
    @EnabledOnOs({OS.LINUX})
    @Order(1)
    void retornaBoolean() {
        Main m = new Main();
        assertTrue(m.retornaBoolean(true));
    }

    @Test
    @EnabledOnOs({OS.WINDOWS})
    @Order(2)
    void retornaBooleanFalso() {
        Main m = new Main();
        assertFalse(m.retornaBoolean(false));
    }

    @Test
    @DisabledOnOs({OS.LINUX})
    @Order(3)
    void testaFail(){
        fail("Metodo testaFail executado");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    @Order(4)
    void testaFailJDK(){
        fail("Metodo testaFailJDK executado");
    }

    @Test
    @Tag("tag-01")
    @Order(5)
    void testTag01(){
        assertTrue(true);
    }

    @Test
    @Tag("tag-02")
    @Order(6)
    void testTag02(){
        assertTrue(true);
    }

}