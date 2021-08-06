package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeisekarteTest {

    Gericht pizza = new Gericht("pizza", 7.50, 20);
    Gericht salat = new Gericht("salat", 3, 50);
    Gericht pasta = new Gericht("pasta", 6.50, 35);
    Speisekarte speisekarte = new Speisekarte(){{
        add(pizza);
        add(salat);
        add(pasta);
    }};

    @Test
    void deleteByNameTest() {
        assertTrue(speisekarte.contains(pasta));
        speisekarte.deleteByName("pasta");
        assertFalse(speisekarte.contains(pasta));
    }

    @Test
    void findByNameTest() {
        assertEquals(salat, speisekarte.findByName("salat"));
        assertNull(speisekarte.findByName("sushi"));
    }

}