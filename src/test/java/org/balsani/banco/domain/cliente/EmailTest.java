package org.balsani.banco.domain.cliente;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmailTest {
    @Test
    void naoDeveriaCriarEmailInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("email invalido"));

    }

}