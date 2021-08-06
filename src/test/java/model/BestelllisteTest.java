package model;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class BestelllisteTest {

    Gericht pizza = new Gericht("pizza", 7.50, 20);
    Gericht salat = new Gericht("salat", 3, 50);
    Gericht pasta = new Gericht("pasta", 6.50, 35);
    Bestellliste bestellliste = new Bestellliste();

    @Test
    public void bestellenTest() {
        assertEquals(0, bestellliste.size());
        bestellliste.bestellen(pizza, 15);
        bestellliste.bestellen(salat, 5);
        assertEquals(2, bestellliste.size());
    }

    @Test
    public void getGesamtPreisTest() {
        bestellliste.bestellen(pizza, 15);
        bestellliste.bestellen(salat, 5);
        assertEquals(127.5, bestellliste.getGesamtPreis(), 0);
        bestellliste.bestellen(pasta, 3);
        assertEquals(147, bestellliste.getGesamtPreis(), 0);
    }
}